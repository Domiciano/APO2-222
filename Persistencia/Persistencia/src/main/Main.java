package main;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        //:::::::UBUNTU::::::::::
        //Si estamos en UBUNTU o MAC
        //Las rutas comienzan con slash (/)
        //String path = "/usr/1143848922/Documents";

        //:::::WINDOWS::::::
        //Las rutas comienzan con el disco local
        //String path = "D:/Usuarios/1143848922/Documents";

        //Referenciar un CARPETA
        String path = "D:/Usuarios/1143848922/Documents";
        File folder = new File(path);

        String[] files = folder.list();
        for(String name : files){
            System.out.println(name);
        }

        //Referenciar un ARCHIVO
        File archivo = new File("D:/Usuarios/1143848922/Documents/miarchivo.txt");
        System.out.println(archivo.exists());

        try {
            FileInputStream fis = new FileInputStream(archivo);
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(fis)
            );
            String line;
            while(( line = reader.readLine()) != null){
                System.out.println(line);
            }
            fis.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
