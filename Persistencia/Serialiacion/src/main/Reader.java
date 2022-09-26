package main;

import com.google.gson.Gson;
import model.Pet;

import java.io.*;
import java.util.ArrayList;

public class Reader {

    public static void main(String[] args) {
        try {
            File file = new File("array.txt");
            System.out.println("Existe: "+file.exists());
            FileInputStream fis = new FileInputStream(file);

            BufferedReader reader = new BufferedReader(new InputStreamReader(fis));

            String json = "";
            String line;
            while ( (line = reader.readLine()) != null ){
                json+=line;
            }
            fis.close();
            System.out.println(json);

            Gson gson = new Gson();
            Pet[] pets = gson.fromJson(json, Pet[].class);

            ArrayList<Pet> arrayPets = new ArrayList<>();
            for(Pet p : pets){
                arrayPets.add(p);
                System.out.println(p.getName());
                System.out.println(p.getOwner().getName());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
