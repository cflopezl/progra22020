package edu.umg.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import javax.swing.*;

public class ControllerLogin {

    public TextField txtUsuario;
    public PasswordField txtContrasena;

    public void logear(ActionEvent actionEvent) {

        if(txtUsuario.getText().equals("cflopezl") && txtContrasena.getText().equals("123456")){
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/edu/umg/view/MenuPrincipal.fxml"));
                Pane root = (Pane) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setTitle("Sistema UMG");
                stage.setScene(new Scene(root, 600, 500));
                stage.show();

                //cerrar el login
                // get a handle to the stage
                Stage stage2 = (Stage) txtUsuario.getScene().getWindow();
                // do what you have to do
                stage2.close();
            }catch (Exception e){
                e.printStackTrace();
            }

        }else{
            JOptionPane.showMessageDialog(null, "Usuario/Contraseña INCORRECTO");
        }

    }
}
