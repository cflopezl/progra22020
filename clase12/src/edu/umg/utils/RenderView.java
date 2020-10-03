package edu.umg.utils;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class RenderView {

    public static void createWindow(String fileName, int width, int height, String title){
        //2. Abrir el menu principal
        Pane root = null;
        try {
            root = (Pane) FXMLLoader.load(RenderView.class.getResource("/edu/umg/view/"+fileName+".fxml"));
            Scene scene = new Scene(root, width, height);
            Stage stage = new Stage();
            stage.setTitle(title);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
