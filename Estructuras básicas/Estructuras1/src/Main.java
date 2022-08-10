public class Main {


    public static void main(String[] args) {

        ListaEnlazada list = new ListaEnlazada();
        list.addLast(new Node(10));
        list.addLast(new Node(-1));
        list.addLast(new Node(15));
        list.addLast(new Node(-7));
        list.addLast(new Node(14));
        list.addFirst(new Node(90));

        list.print();

        Node res1 = list.search(100);
        Node res2 = list.search(-7);

        System.out.println(res1);
        System.out.println(res2);
        System.out.println("--------");
        list.delete(-1);
        list.print();
        System.out.println("--------");
        list.delete(90);
        list.print();
        System.out.println("--------");
        list.delete(14);
        list.print();
        System.out.println("--------");

    }

}
