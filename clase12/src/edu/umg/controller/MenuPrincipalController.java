package edu.umg.controller;

import edu.umg.DAO.CarreraDAO;
import edu.umg.modelo.Carrera;
import edu.umg.utils.MyCustomException;
import edu.umg.utils.VariablesGlobales;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;

public class MenuPrincipalController {
    public TextField txtNombreCarrera;
    public TableView tblCarrera;
    public TableColumn tcCodigo;
    public TableColumn tcNombre;
    public Pane paneCarrera;
    CarreraDAO carreraDAO = new CarreraDAO();

    @FXML
    public void initialize(){
        tcCodigo.setCellValueFactory( new PropertyValueFactory<Carrera, Integer>("codigo") );
        tcNombre.setCellValueFactory( new PropertyValueFactory<Carrera, String>("nombre") );

        //obtener todos los registros de las carreras almacenadas en la DB
        VariablesGlobales.umg.setCarreras(carreraDAO.getDBCarreras());
        if(VariablesGlobales.umg.getCarreras().size()>0){
            ObservableList<Carrera> data = FXCollections.observableArrayList(VariablesGlobales.umg.getCarreras());
            tblCarrera.setItems(data);
        }
    }

    public void agregarCarrera(ActionEvent actionEvent){
        //1. Crear instancias del modelo
        //1.1 Crear instacia de Carrera
        Carrera carrera = null;
        try {
            carrera = new Carrera(txtNombreCarrera.getText());
            //persistir objeto carrera en la base de datos
            carreraDAO.saveCarrera(carrera);
            //1.2 Agregar la carrera a la universidad
            VariablesGlobales.umg.addCarrera(carrera);

            //2. Feedback al usuario (view)
            //2.1 Mostrar TODAS las carreras de la Universidad
            ObservableList<Carrera> data = FXCollections.observableArrayList(VariablesGlobales.umg.getCarreras());
            tblCarrera.setItems(data);

            //2.2 Limpiar la caja de texto del nombre de la carrera
            txtNombreCarrera.setText("");
        } catch (MyCustomException e) {
            e.printStackTrace();
        }

    }

    public void verPanelCarrera(ActionEvent actionEvent) {
        paneCarrera.setVisible(true);
    }
}
