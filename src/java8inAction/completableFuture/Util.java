package java8inAction.completableFuture;

public class Util {
    public static void delay(){
        try{
            Thread.sleep(5000L);
        } catch (InterruptedException e){
            throw new RuntimeException();
        }
    }
}
