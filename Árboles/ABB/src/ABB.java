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

    public Node search(int goal){
        return search(goal, root);
    }

    private Node search(int goal, Node current){
        if(current == null){
            return null;
        }
        if(goal == current.getValue()){
            return current;
        }
        else if(goal < current.getValue()){
            return search(goal, current.getLeft());
        } else{
            return search(goal, current.getRight());
        }
    }

    public Node delete(int goal){
        return delete(goal, root);
    }

    private Node delete(int goal, Node current){
        if(current == null){
            return null;
        }
        if(current.getValue() == goal){
            //1. Nodo Hoja
            if(current.getLeft() == null && current.getRight() == null){
                if(current == root){
                    root = null;
                }else{

                }
                return null;
            }
            //2. Nodo solo hijo izquierdo
            else if (current.getRight() == null){
                if(current == root){
                    root = current.getLeft();
                }
                return current.getLeft();
            }
            //3. Nodo solo hijo derecho
            else if(current.getLeft() == null){
                if(current == root){
                    root = current.getRight();
                }
                return current.getRight();
            }
            //4. Nodo con dos hijos
            else{
                Node min = getMin(current.getRight());
                //Transferencia de valores, NUNCA de conexiones
                current.setValue(min.getValue());
                //Hacer eliminación a partir de la derecha
                Node subarbolDER = delete(min.getValue(), current.getRight());
                current.setRight( subarbolDER );
                return current;
            }


        }else if(goal < current.getValue()){
            Node subArbolIzquierdo = delete(goal, current.getLeft());
            current.setLeft(subArbolIzquierdo);
            return current;
        }else{
            Node subArbolDerecho = delete(goal, current.getRight());
            current.setRight(subArbolDerecho);
            return current;
        }
    }

    public Node getMin(Node current){
        if(current.getLeft() == null){
            return current;
        }
        return getMin(current.getLeft());
    }




}





