package edu.umg.controller;

import edu.umg.modelo.Universidad;
import edu.umg.utils.VariablesGlobales;
import javafx.event.ActionEvent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import javax.swing.*;

public class LoginController {
    public TextField txtUsuario;
    public PasswordField txtContrasenia;

    public void validarIngreso(ActionEvent actionEvent) {
        //validar el ingreso al usuario
        //usuario=chris , password=123456
        if( txtUsuario.getText().equals("chris") && txtContrasenia.getText().equals("123456") ){
            //tiene acceso
            JOptionPane.showMessageDialog(null, "Ingreso Correcto");
            VariablesGlobales.umg = new Universidad("Universidad Mariano Gálvez");
        }else{
            //acceso restringido
            JOptionPane.showMessageDialog(null, "Intruso, acceso denegado", "Error",JOptionPane.ERROR_MESSAGE);
        }
    }
}
