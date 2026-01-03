package java8inAction.lambdas;

public interface MyInterfaceOne {
    default void printName(){
        System.out.println("One");
    }
}
