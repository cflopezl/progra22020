package edu.umg.controller;

import edu.umg.modelo.Carrera;
import edu.umg.utils.VariablesGlobales;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import javax.swing.*;

public class ControllerMenuPrincipal {
    public MenuBar menu;
    public TextField txtNombreCarrera;
    public TableView tblCarreras;
    public TableColumn tfCodigo;
    public TableColumn tfNombre;
    public Pane paneCarrera;

    public ControllerMenuPrincipal(){
    }

    @FXML
    public void initialize() {
        tfCodigo.setCellValueFactory(new PropertyValueFactory<Carrera, Integer>("codigo"));
        tfNombre.setCellValueFactory(new PropertyValueFactory<Carrera, String>("nombre"));
    }

    public void close(ActionEvent actionEvent) {
        // get a handle to the stage
        Stage stage = (Stage) menu.getScene().getWindow();
        // do what you have to do
        stage.close();
    }

    public void addCarrera(ActionEvent actionEvent) {
        try {
            VariablesGlobales.u1.addCarrera(new Carrera(txtNombreCarrera.getText()));

            ObservableList<Carrera> data =
                    FXCollections.observableArrayList(VariablesGlobales.u1.getCarreras());
            tblCarreras.setItems(data);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void showCarrera(ActionEvent actionEvent) {
        paneCarrera.setVisible(true);
    }
}
