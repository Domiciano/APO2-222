public class BST <T>{

    private Node<T> root;

    public void insert(Node node){
        if(root == null){
            root = node;
        }else{
            insert(node, root);
        }
    }
    private void insert(Node node, Node current){
        if(node.getKey().compareTo(current.getKey()) < 0){
            if(current.getLeft() == null){
                current.setLeft(node);
                return;
            }else {
                insert(node, current.getLeft());
                return;
            }
        }else if(node.getKey().compareTo(current.getKey()) > 0){
            if(current.getRight() == null){
                current.setRight(node);
                return;
            }else {
                insert(node, current.getRight());
                return;
            }
        }else{
            //No hacemos nada
        }
    }

    public void inorder(){
        inorder(root);
    }

    private void inorder(Node<T> current){
        if(current == null){
            return;
        }
        inorder(current.getLeft());
        System.out.println(current.getKey());
        inorder(current.getRight());
    }

}
