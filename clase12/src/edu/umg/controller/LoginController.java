package edu.umg.controller;

import edu.umg.modelo.Universidad;
import edu.umg.utils.RenderView;
import edu.umg.utils.VariablesGlobales;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;

public class LoginController {
    public TextField txtUsuario;
    public PasswordField txtPassword;

    public void validarIngreso(ActionEvent actionEvent) {
        //1. Validar usuario=chris, password=123456
        if( txtUsuario.getText().equals("chris") && txtPassword.getText().equals("123456") ){
            //Ingreso a la app
            VariablesGlobales.umg = new Universidad("Universidad Mariano Galvez");
            //2. Abrir el menu principal
                RenderView.createWindow("MenuPrincipal",600,300,"Menu Principal Mi UMG");
            //3. cerrar la ventana de Login
                Stage stageLogin = (Stage) txtUsuario.getScene().getWindow();
                stageLogin.close();

        }else{
            //Denegamos el acceso
            JOptionPane.showMessageDialog(null, "PELIGRO, INTRUXO", "InfoBox", JOptionPane.ERROR_MESSAGE);
            txtUsuario.setText("");
            txtPassword.setText("");
        }
    }
}
