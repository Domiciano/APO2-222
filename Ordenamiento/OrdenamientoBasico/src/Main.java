import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Zapata");
        names.add("Arboleda");
        names.add("Arbelaez");
        names.add("Caicedo");
        names.add("Osorio");
        names.add("Martinez");
        names.add("Yustes");

        //Ordenar este arreglo de Strings:
        for(int j=0 ; j<names.size() ; j++){
            for(int i=1 ; i<names.size()-j ; i++){
                if(names.get(i-1).compareTo(names.get(i)) < 0){
                    //NADA
                }else{
                    //SWAP
                    String anterior = names.get(i-1);
                    String actual = names.get(i);
                    names.set(i, anterior);
                    names.set(i-1, actual);
                }
            }
        }
        System.out.println(names);


        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(-4);
        arr.add(22);
        arr.add(40);
        arr.add(-2);
        arr.add(-80);
        arr.add(-100);
        arr.add(-120);
        arr.add(-180);



        //Seleccion sort

        for(int rojo = 0 ; rojo < arr.size()-1 ; rojo++) {
            for (int azul = rojo+1; azul < arr.size(); azul++) {
                if(arr.get(rojo) < arr.get(azul)){
                    //NADA
                }else{
                    int valorRojo = arr.get(rojo);
                    int valorAzul = arr.get(azul);
                    arr.set(rojo, valorAzul);
                    arr.set(azul, valorRojo);
                }
            }
        }
        System.out.println(arr);






        //Método burbuja
        //arr.set(0, 78);

        for(int j=0 ; j<arr.size() ; j++){
            for(int i=1 ; i<arr.size()-j ; i++){
                if(arr.get(i-1) < arr.get(i)){
                    //NADA
                }else{
                    //SWAP
                    int anterior = arr.get(i-1);
                    int actual = arr.get(i);
                    arr.set(i, anterior);
                    arr.set(i-1, actual);
                }
            }
        }






    }

}
