package fernuni.casting;

public class Student extends Person {

    private int id;

    Student(String firstname, String lastname) {
        super(firstname, lastname);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
