public class Main {


    public static void main(String[] args) {
        ABB tree = new ABB();
        tree.insert(new Node(10));
        tree.insert(new Node(5));
        tree.insert(new Node(6));
        tree.insert(new Node(14));
        tree.insert(new Node(1));
        tree.insert(new Node(2));
        tree.insert(new Node(8));
        tree.insert(new Node(7));
        tree.insert(new Node(3));

        tree.inorder();
    }



}
