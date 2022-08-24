public class ListaCircular {

    private Node head;

    public void addLast(Node input){
        if(head == null){
            head = input;
            head.setNext(input);
            head.setPrev(input);
        }else{
            Node tail = head.getPrev();
            //Los enlaces next
            tail.setNext(input);
            input.setNext(head);

            //Los enlaces previous
            head.setPrev(input);
            input.setPrev(tail);
        }
    }

    public void print(){
        print(head);
    }

    private void print(Node current){

        //Casos base
        if(current.getNext() == head){
            System.out.println(current.getId());
            return;
        }

        //Llamado recursivo
        System.out.println(current.getId());
        print(current.getNext());
    }

    public void deleteById(int goal) {
        deleteById(head, goal);
    }

    //Eliminar un nodo por su ID
    public void deleteById(Node current, int goal) {
        if (goal == head.getId()) {
            Node prev = current.getPrev();
            Node next = current.getNext();
            prev.setNext(next);
            next.setPrev(prev);
            head = next;
        }
        if(current.getId() == goal){
            Node prev = current.getPrev();
            Node next = current.getNext();
            prev.setNext(next);
            next.setPrev(prev);
        }
        if(current.getNext() == head){
            return;
        }

        deleteById(current.getNext(), goal);


    }






}
