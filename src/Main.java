import java8inAction.lambdas.MyInterfaceOne;
import java8inAction.lambdas.MyInterfaceTwo;

import java.util.HashSet;
import java.util.Set;

public class Main {
    class Implementor implements MyInterfaceOne, MyInterfaceTwo{

    }

    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("Hello");
        stringSet.add("World");
        stringSet.add("of");
        stringSet.add("Java");

        System.out.println(stringSet);



    }
}
