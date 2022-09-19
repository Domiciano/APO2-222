package main;

import model.Person;

import java.io.*;
import java.util.ArrayList;

public class Desearializador {


    public static void main(String[] args) {
        File archivo = new File("D:/Usuarios/1143848922/Documents/people.temp");
        System.out.println(archivo.exists());
        ArrayList<Person> people = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(archivo);
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(fis)
            );
            String line;
            while(( line = reader.readLine()) != null){
                System.out.println(line);
                String[] parts = line.split(" ");
                Person p = new Person(parts[0], Integer.parseInt(parts[1]));
                people.add(p);
            }
            fis.close();
            System.out.println("Tamaño del arreglo: "+people.size());
            System.out.println(people.get(2).name);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
