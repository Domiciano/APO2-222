package main;

import com.google.gson.Gson;
import model.Owner;
import model.Pet;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();

        ArrayList<Pet> pets = new ArrayList<>();

        Owner juanjose = new Owner("Juan José Díaz","1111");
        Pet goldie = new Pet("Goldie", 2, juanjose);

        Owner mateo = new Owner("Mateo Silva","2222");
        Pet toby = new Pet("Toby", 2, mateo);

        Owner yustes = new Owner("Juan Yustes","3333");
        Pet loki = new Pet("Loki", 2, yustes);

        pets.add(goldie);
        pets.add(toby);
        pets.add(loki);

        String json = gson.toJson(pets);
        System.out.println(json);

        try {
            FileOutputStream fos = new FileOutputStream(new File("array.txt"));
            fos.write( json.getBytes(StandardCharsets.UTF_8) );
            fos.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
