public class Nodo <T>{

    public Nodo(T value) {
        this.value = value;
        this.pointer = null;
    }

    private T value;

    private T pointer;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public T getPointer() {
        return pointer;
    }

    public void setPointer(T pointer) {
        this.pointer = pointer;
    }
}
