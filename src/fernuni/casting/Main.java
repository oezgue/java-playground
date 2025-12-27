package fernuni.casting;

public class Main {
    public static void main(String[] args) {
        Person person = new Person ("Frank", "Müller");

        ObjectContainer oc = new ObjectContainer("Frank");
        Person person2 = (Person) oc.get();
        person.setFirstname("frank2");
        System.out.println(person2.getFirstname());

    }
}
