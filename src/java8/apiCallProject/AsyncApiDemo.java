package java8.apiCallProject;
import java.io.*;
import java.net.*;
import java.nio.Buffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AsyncApiDemo {
    private final ExecutorService ioPool = Executors.newFixedThreadPool(8);

    public static void main(String[] args) {
        new AsyncApiDemo().run();
    }

    private void run () {
        try{
            String url1 = "https://jsonplaceholder.typicode.com/todos/1";
            String url2 = "https://jsonplaceholder.typicode.com/todos/2";

            CompletableFuture<String> f1 = fetchJsonAsync(url1);
            CompletableFuture<String> f2 = fetchJsonAsync(url2);

            CompletableFuture<List<String>> combined = CompletableFuture.allOf(f1,f2).thenApply(
                    v->Arrays.asList(f1.join(), f2.join())
            );

            combined.thenAccept(l -> {
                        System.out.println("Antwort 1:\n" + l.get(0));
                        System.out.println("Antwort 2:\n" + l.get(1));
                    })
                    .exceptionally(ex -> {
                        ex.printStackTrace();
                        return null;
                    }).join();

        } finally {
            ioPool.shutdown();
        }
    }



    private CompletableFuture<String> fetchJsonAsync (String url){
        return CompletableFuture.supplyAsync(()->
        {
            try {
                return httpGet(url);
            } catch (IOException e) {
                throw new CompletionException(e);
            }
        },ioPool);
    }

    private static String httpGet(String urlStr) throws IOException {
        URL url = new URL(urlStr);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        con.setConnectTimeout(5000);
        con.setReadTimeout(5000);

        int code = con.getResponseCode();
        InputStream is = (code >= 200 && code < 300) ? con.getInputStream() : con.getErrorStream();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8))){
            return br.lines().collect(Collectors.joining("\n"));
        } finally {
            con.disconnect();
        }

    }


}
