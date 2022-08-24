public class ABB {

    private Node root;

    public void insert(Node node){
        if(root == null){
            root = node;
        }else{
            insert(node, root);
        }
    }
    private void insert(Node node, Node current){
        if (node.getValue() < current.getValue()) {
            //Izquierda
            if(current.getLeft() != null){
                insert(node, current.getLeft());
            }else{
                current.setLeft(node);
            }
        }
        else if(node.getValue() > current.getValue()){
            //Derecha
            if(current.getRight() != null){
                insert(node, current.getRight());
            }else{
                current.setRight(node);
            }
        }else{
            //Igualdad
        }
    }


    public void inorder(){
        inorder(root);
    }
    private void inorder(Node current){
        if(current == null){
            return;
        }
        inorder(current.getRight());
        System.out.println(current.getValue());
        inorder(current.getLeft());
    }




}
