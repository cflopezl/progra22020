package edu.umg;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class MainFX extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Pane layout = (Pane) FXMLLoader.load(getClass().getResource("/edu/umg/view/Login.fxml"));
        Scene scene = new Scene(layout, 400, 300);

        stage.setTitle("Mi UMG");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
