package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.text.*;


import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        Group root = new Group();

        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        //Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        Scene s = new Scene(root, 320, 240);
        stage.setTitle("Hello!");
        Rectangle r = new Rectangle(100,100,100,100);
        root.getChildren().add(r);
        stage.setScene(s);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}