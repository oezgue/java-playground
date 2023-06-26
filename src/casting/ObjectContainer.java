package casting;

public class ObjectContainer {
    private Object element;

    ObjectContainer (Object element){
        this.element = element;
    }

    Object get () {
        return this.element;
    }
}
