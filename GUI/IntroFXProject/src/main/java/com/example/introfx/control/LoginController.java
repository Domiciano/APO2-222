package com.example.introfx.control;

import com.example.introfx.HelloApplication;
import com.example.introfx.model.FileOpenerData;
import com.example.introfx.model.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.util.Calendar;

public class LoginController {

    @FXML
    private TextField userTF;

    @FXML
    private PasswordField passPF;

    @FXML
    void login(ActionEvent event) {
        String username = userTF.getText();
        String password = passPF.getText();
        if(username.equals("admin") && password.equals("pass")){
            FileOpenerData.getInstance().setUser(
                    new User(username, password)
            );
            HelloApplication.showWindow("FileOpener.fxml");
            Stage currentStage = (Stage) userTF.getScene().getWindow();
            currentStage.hide();




        }else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Pilas");
            alert.setContentText("Escribiste mal el username o contraseña");
            alert.showAndWait();
        }
    }

}
