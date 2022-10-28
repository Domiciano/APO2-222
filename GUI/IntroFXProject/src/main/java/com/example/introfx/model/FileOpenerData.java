package com.example.introfx.model;

import java.io.File;

public class FileOpenerData {

    //Formato del singleton
    private static FileOpenerData instance;
    private FileOpenerData(){
        user = new User("","");
    }
    public static FileOpenerData getInstance(){
        if(instance == null){
            instance = new FileOpenerData();
        }
        return instance;
    }
    //Los atributos de la clase
    public User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
