
public class Main_Linked_List {
    public static void main(String[] args) {
        LinkedList<Object> lista = new LinkedList<>();
        lista.add(11);
        lista.add(12);
        lista.add(13);
        System.out.println(lista.get(2));
        System.out.println(lista.getCounter());
        lista.print();
    }
}
