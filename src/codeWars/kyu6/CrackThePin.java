package codeWars.kyu6;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.function.Function;
import java.util.stream.IntStream;

import static util.Utilities.measurePerf;


//Given is a md5 hash of a five digits long PIN. It is given as string. Md5 is a function to hash your password: "password123" ===> "482c811da5d5b4bc6d497ffa98491e38"
public class CrackThePin {

    public String crack(String hash){
        long i = 0;
        String pin = "";
        while (i <100_000){
            pin = String.format("%05d", i);
            try {
                if (hashing(pin).equals(hash.toUpperCase()))
                {
                    return pin;
                }
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
            i++;
        }
        return pin;
    }

    public String crackStream(String hash) {
        return IntStream.rangeClosed(0,100_000)
                .mapToObj(n -> String.format("%05d",n))
                .filter(s -> {
                    try {
                        return hash.toUpperCase().equals(hashing(s));
                    } catch (NoSuchAlgorithmException e) {
                        return false;
                    }
                })
                .parallel()
                .findFirst().orElse("");
    }

    private String hashing(String s) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] digest = md.digest(s.getBytes());
        StringBuilder sb = new StringBuilder();
        for (byte b : digest) {
            sb.append(String.format("%02X", b));
        }
        return sb.toString();
    }

    public static Long measureSumPerf(Function<String, String> adder, String n){
        long fastest = Long.MAX_VALUE;
        for (int i = 0; i<10; i++){
            long start = System.nanoTime();
            adder.apply(n);
            long duration = (System.nanoTime() - start) / 1_000_000;
            //System.out.println("Result: " + sum);
            if (duration < fastest) fastest = duration;
        }

        return fastest;
    }

    public static void main(String[] args) throws NoSuchAlgorithmException {
        CrackThePin cracker = new CrackThePin();
        System.out.println(cracker.crackStream("D3EB9A9233E52948740D7EB8C3062D14"));
        System.out.println(cracker.hashing("99999"));

        String hash = "D3EB9A9233E52948740D7EB8C3062D14";
        String password = "12345";
        System.out.println(
            measurePerf(s->cracker.crack(s), "D3EB9A9233E52948740D7EB8C3062D14") + " ms"
        );
//        System.out.println(
//            measurePerf(cracker::crack, "D3EB9A9233E52948740D7EB8C3062D14") + " ms"
//        );

    }
}
