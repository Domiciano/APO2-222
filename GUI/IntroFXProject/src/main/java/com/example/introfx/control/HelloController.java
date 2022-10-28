package com.example.introfx.control;

import com.example.introfx.HelloApplication;
import com.example.introfx.model.FileOpenerData;
import com.example.introfx.model.FileUtils;
import com.example.introfx.model.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private Button openBTN;

    @FXML
    private TextField pathTF;

    @FXML
    private TextArea fileContentTA;


    public HelloController(){
        //Los @FXML todavía están nulos
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //Los FXML están diferentes de nulo
        User currentUser = FileOpenerData.getInstance().getUser();
        fileContentTA.setText("Hola "+currentUser.getUsername());
    }


    @FXML
    void openFile(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        //Como referenciar el stage desde un controller
        Stage stage = (Stage) openBTN.getScene().getWindow();
        File file = fileChooser.showOpenDialog(stage);
        String path = file.getAbsolutePath();
        pathTF.setText(path);
        String content = FileUtils.readFile(path);
        fileContentTA.setText(content);

    }


}
