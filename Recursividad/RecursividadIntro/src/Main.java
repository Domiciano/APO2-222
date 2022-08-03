public class Main {

    public static void main(String[] args) {
        Main main = new Main();
    }

    public Main(){
        recursive(0);
        System.out.println("Fin del algoritmo");
    }



    public void recursive(int i){
        if(i > 10){
            return;
        }

        System.out.println("Cuenta: "+i);
        recursive(i+1);
    }

}
