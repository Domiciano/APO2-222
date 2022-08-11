package main;

import java.util.ArrayList;
import java.util.Arrays;

public class SolucionMaleta {
    
    //La solución tiene un caso que no funciona, está en reparación

    public static void main(String[] args) {
        int[] objetos = new int[]{3, 3, 50, 200, 3, 200, 100, 3};

        ArrayList<Integer> res = fun(objetos, new ArrayList<>(), 500);

        if (res == null) {
            System.out.println("No hay solución");
        } else {
            System.out.println("--->");
            for (int num : res) {
                System.out.println(num);
            }
            System.out.println("<---");
        }

    }

    public static ArrayList<Integer> fun(int[] objetos, ArrayList<Integer> selectedObjects, int pesoRestante) {
        //Condiciones base

        //Si ya se acabaron los objeto
        if (objetos.length == 0) {
            return null;
        }

        //Si el peso de la maleta es cero exactamente
        if (pesoRestante == 0) {
            return selectedObjects;
        }

        //Si los objetos que se metieron en la maleta pesan más que la capacidad de la maleta
        if (pesoRestante < 0) {
            return null;
        }

        //Operación + llamado recursivo
        int nuevoPeso = pesoRestante - objetos[0];
        selectedObjects.add(objetos[0]);
        //Arrays.copyOfRange, permite crear un nuevo arreglo seleccionando un rango
        //Específicamente, lo que se está haciendo es eliminar el primer elemento del arreglo
        ArrayList<Integer> res = fun(Arrays.copyOfRange(objetos, 1, objetos.length), selectedObjects, nuevoPeso);
        //Si lo que retorna el algorimo recursivo es diferente de nulo, es porque se encontró una solución posible
        if (res != null) {
            return res;
        }
        //Si lo que retorna el algoritmo recursivo es nulo, es porque no encontró una solición posible
        //entonces se remueve el último objeto insertado a la maleta y se prueba con el siguiente.
        else {
            selectedObjects.remove(selectedObjects.size() - 1);
            return fun(Arrays.copyOfRange(objetos, 1, objetos.length), selectedObjects, pesoRestante );
        }

    }
}
