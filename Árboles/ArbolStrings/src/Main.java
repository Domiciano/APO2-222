public class Main {

    public static void main(String[] args) {

      BST<Student> arbol = new BST<>();

        Student S1 = new Student("A00111", "Andres Andrade");
        Node<Student> A1 = new Node<>(S1.getCode(), S1);

        Student S2 = new Student("A00147", "Bernardo Bernal");
        Node<Student> A2 = new Node<>(S2.getCode(), S2);

        Student S3 = new Student("A00287", "Carlos Caicedo");
        Node<Student> A3 = new Node<>(S3.getCode(), S3);

        Student S4 = new Student("A00196", "Daniela Delgado");
        Node<Student> A4 = new Node<>(S4.getCode(), S4);

        Student S5 = new Student("A00207", "Enrique Espinoza");
        Node<Student> A5 = new Node<>(S5.getCode(), S5);

        arbol.insert(A1);
        arbol.insert(A2);
        arbol.insert(A3);
        arbol.insert(A4);
        arbol.insert(A5);

        arbol.inorder();



    }







    public static int compare(String s1, String s2){

        //Los length son iguales
        for (int i = 0; i < s1.length() && i < s2.length(); i++) {
                int i1 = s1.charAt(i);
                int i2 = s2.charAt(i);
                if (i1 == i2) {
                    continue;
                } else {
                    return i2 - i1;
                }
        }

        //Los length diferentes
        if(s1.length() > s2.length())
            return s1.charAt(s2.length())*-1;
        else if(s1.length() < s2.length())
            return s2.charAt(s1.length());
        else
            return 0;


    }


}
