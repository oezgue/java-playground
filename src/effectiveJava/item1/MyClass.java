package effectiveJava.item1;

public class MyClass {
    int member;
    int member2;
    static MyClass myClass;

    public static MyClass myClassFactory (){
        if (MyClass.myClass == null) {
            MyClass.myClass = new MyClass();
        }
        return MyClass.myClass;
    }

    public int getMember() {
        return member;
    }

    public void setMember(int member) {
        this.member = member;
    }

    public int getMember2() {
        return member2;
    }

    public void setMember2(int member2) {
        this.member2 = member2;
    }



    public static void main(String[] args) {
        MyClass neueKlasse = MyClass.myClassFactory();
        neueKlasse.setMember(1);
        System.out.println(neueKlasse.member);
    }
}

