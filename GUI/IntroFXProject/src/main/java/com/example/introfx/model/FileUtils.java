package com.example.introfx.model;

import java.io.*;

public class FileUtils {

    public static String readFile(String path){
        StringBuilder output = new StringBuilder();
        File f = new File(path);
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(f)));
            String line;
            while( (line = reader.readLine()) != null ){
                output.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return output.toString();
    }

}
