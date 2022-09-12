public class LinkedList<T>{

    public LinkedList(){

    }

    private T value;

    private Nodo head;

    private Nodo current;

    private int counter;

    public void add(T value){
        if (head == null) {
            head = new Nodo(value);
        }
        else if (head.getPointer() == null) {
            current.setPointer(head.getValue());
            current.setValue(value);
        }
        Nodo Temp = new Nodo(value);
        Nodo Current = head;
        if (Current != null) {
            while (Current.getPointer() != null) {
                Current = (Nodo) Current.getPointer();
            }
            Current.setPointer(Temp);
        }
        counter++;
    }

    public Object get(int index)
    {
        if (index < 0)
            return null;
        Nodo Current = null;
        if (head != null) {
            Current = (Nodo) head.getPointer();
            for (int i = 0; i < index; i++) {
                if (Current.getPointer() == null)
                    return null;
                Current = (Nodo) Current.getPointer();
            }
            return Current.getValue();
        }
        return Current;
    }

    public int getCounter() {
        return counter;
    }
}
