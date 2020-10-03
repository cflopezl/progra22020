package edu.umg;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class TestFX extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        //GUI
        Circle circ = new Circle(40, 40, 30);
        Group root = new Group(circ);

        //Estructura de JavaFX
        Scene scene = new Scene(root, 400, 300);
        stage.setTitle("My JavaFX Application");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
