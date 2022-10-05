package main;

import model.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Geometry figura1 = new Circle();
        Geometry figura2 = new Square();

        ArrayList<Geometry> figures = new ArrayList<>();
        figures.add(figura1);
        figures.add(figura2);

        for(Geometry g : figures){
            double area = g.calculateArea();
            System.out.println(area);
        }

        //Upcasting
        Square squareEjemplo = new Square();
        Geometry geoEjemplo = squareEjemplo;
        Object objEjemplo = squareEjemplo;

        //Downcasting
        Geometry alfa = (Geometry) objEjemplo;
        Square beta = (Square) objEjemplo;

        //Crear objetos de intefaz
        Geometry geo = new Geometry() {
            @Override
            public double calculateArea() {
                return 8+8;
            }
        };
        System.out.println(geo instanceof Geometry);
        System.out.println(geo instanceof Object);
        System.out.println(geo instanceof Square);
        System.out.println(geo instanceof Circle);


        Executor executor = new Executor();

        executor.execute((s1, s2)->{
            System.out.println("Hola mundo");
        });


    }

}
