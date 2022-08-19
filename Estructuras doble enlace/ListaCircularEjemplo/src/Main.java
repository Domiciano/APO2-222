public class Main {


    public static void main(String[] args) {
        ListaCircular list = new ListaCircular();

        list.addLast(new Node(1, ""));
        list.addLast(new Node(234, ""));
        list.addLast(new Node(456, ""));
        list.addLast(new Node(567, ""));
        list.addLast(new Node(923, ""));

        list.print();

        list.deleteById(456);

        System.out.println("---------");
        list.print();
    }

}
