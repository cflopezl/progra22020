package edu.umg;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Principal extends Application {

    private Parent createContent(){
        return new StackPane(new Text("Hello World"));
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setScene( new Scene(createContent(), 300, 300));
        primaryStage.show();
    }

    public static void main (String[] args){
        launch(args);
    }
}
