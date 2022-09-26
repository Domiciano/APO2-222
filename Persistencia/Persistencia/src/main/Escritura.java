package main;

import model.Person;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class Escritura {

    public static void main(String[] args) {

        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Alfa", 1));
        people.add(new Person("Beta", 2));
        people.add(new Person("Gamma", 3));
        people.add(new Person("Delta", 4));
        people.add(new Person("Eta", 5));
        //Alfa 1
        //Beta 2

        String text = "";
        for(Person p : people){
            text += p.name + " " +p.age+"\n";
        }
        System.out.println(text);

        File file = new File("D:/Usuarios/1143848922/Documents/people.temp");
        try {
            FileOutputStream fos = new FileOutputStream(file);
            fos.write(text.getBytes(StandardCharsets.UTF_8));
            fos.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
