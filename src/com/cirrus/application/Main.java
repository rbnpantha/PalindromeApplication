package com.cirrus.application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by Rabin on 6/7/2017.
 */
public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            Parent root = null;
            Scene scene = null;
            root = FXMLLoader.load(getClass().getResource("../view/palindrome.fxml"));
            scene = new Scene(root);
            scene.getStylesheets().add("../view/custom.css");
            primaryStage.setTitle("Palindrome");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}