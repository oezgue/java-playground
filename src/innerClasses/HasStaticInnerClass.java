package innerClasses;

public class HasStaticInnerClass {
    final int finalInt = 3;
    final static int staticInt= 7;

    static class InnerClass {

       int innerInt = 33;
       static int innerStaticInt = 66;

       void printNotStatic (){
           System.out.println("staticInt" + staticInt);
       }
    }
}
