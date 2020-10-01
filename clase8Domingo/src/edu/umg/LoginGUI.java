package edu.umg;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginGUI extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        try {
            Pane layout = (Pane) FXMLLoader.load(getClass().getResource("/edu/umg/view/Login.fxml"));
            stage.setTitle("¡Hola JavaFX!");
            stage.setScene(new Scene(layout, 600, 400));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
