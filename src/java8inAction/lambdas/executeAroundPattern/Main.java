package java8inAction.lambdas.executeAroundPattern;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public Main() throws IOException {
    }

    public static String processFile() throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))){
            return br.readLine();
        }
    }

    public static String processFile(BufferedReaderProcessor p) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))){

        return p.process(br);
        }
    }

    static String line;

    static {
        try {
            line = processFile((BufferedReader br) -> br.readLine() + "\n" + br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //String twoLine = processFile((BufferedReader br) -> br.readLine() + br.readLine());

    public static void main(String[] args) {
        System.out.println(line);
    }

}
