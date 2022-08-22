package com.example.demo;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.FileInputStream;

public class LoadImage extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Image Loading");
        Group IMFX = new Group();
        Scene IS = new Scene(IMFX, 320, 400);
        FileInputStream inputstream = new FileInputStream("C:/Users/abhil/Downloads/Java/demo/src/main/java/com/example/demo/resources/breach.jpg");
        Image image = new Image(inputstream);
        ImageView imageView = new ImageView(image);
        IMFX.getChildren().add(imageView);
        stage.setScene(IS);
        stage.show();
    }

    public static void main(String[] args){
        launch();

    }
}
