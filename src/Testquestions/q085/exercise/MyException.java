package Testquestions.q085.exercise;

public class MyException extends RuntimeException {}

class Test {
    public static void main(String[] args) {
        try {
            method1();
        } catch (MyException e){
            System.out.println("A");
        }
    }

    private static void method1() {
        try {
            throw Math.random()>0.5 ? new RuntimeException() : new MyException();
        } catch (RuntimeException e){
            System.out.println("B");
        }
    }
}
