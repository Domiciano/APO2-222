public class ListaEnlazada {

    private Node head;
    private Node tail;

    public void addLast(Node node){
        if(head == null){
            head = node;
            tail = node;
        }else{
            tail.setNext(node);
            tail = node;
        }
    }

    public void addFirst(Node node){
        if(head == null){
            head = node;
            tail = node;
        }else{
            node.setNext(head);
            head = node;
        }
    }

    //Método de activacion
    public void print(){
        print(head);
    }

    private void print(Node current){
        //Caso base
        if(current == null){
            return;
        }
        //Llamado recursivo
        System.out.println(current.getValue());
        print(current.getNext());
    }

    //Activador
    public Node search(int goal){
        return search(goal, head);
    }
    //Recursivo
    private Node search(int goal, Node current){
        //Casos base
        if(current == null){
            return null;
        }
        if(current.getValue() == goal){
            return current;
        }
        //Llamados recursivos
        return search(goal, current.getNext());

    }
    public void delete(int goal){
        delete(goal, null, head);
    }
    private void delete(int goal, Node previous, Node current){
        //Casos base
        if(current == null){
            return;
        }
        //Caso borde: eliminar la cabeza
        if(head.getValue() == goal){
            head = current.getNext();
            return;
        }
        if(tail.getValue() == goal && tail == current){
            previous.setNext(null);
            tail = previous;
            return;
        }
        if(current.getValue() == goal){
            previous.setNext(current.getNext());
            return;
        }
        //Llamado recursivo
        delete(goal, current, current.getNext());
    }

}







