package Testquestions.q086.trying;

public class Q86 {
    public static void main(String[] args) {
        A b = (B)new A();
        b.test();
    }
}

class A {
    public void test(){
        System.out.println("A");
    }
}

class B extends A{
    public void test(){
        System.out.println("B");
    }
}

class C extends A {
    public void test(){
        System.out.println("C");
    }
}
