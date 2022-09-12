public class Nodo <T>{

    public Nodo(T value) {
        this.value = value;
        this.pointer = null;
    }

    private T value;

    private Nodo pointer;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Nodo getPointer() {
        return pointer;
    }

    public void setPointer(Nodo pointer) {
        this.pointer = pointer;
    }
}
