package com.example.demo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.FileInputStream;

public class LoadImage extends Application {


    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Image Loading");
        Group IMFX = new Group();
        Scene IS = new Scene(IMFX, 800, 1000);
        FileInputStream inputstream = new FileInputStream("C:/Users/abhil/Downloads/Java/demo/src/main/java/com/example/demo/resources/breach.jpg");
        Image image = new Image(inputstream);
        ImageView imageView = new ImageView(image);
        imageView.setPreserveRatio(true);
        imageView.setFitHeight(200);
        imageView.setX(200);
        imageView.setY(200);

        int brClick = 0;
        Text imgT = new Text("Breaches Clicked");
        imgT.setX(100);
        imgT.setFill(Color.BLACK);

        Button imgB = new Button();
        imgB.setGraphic(imageView);
        EventHandler<ActionEvent> imgEV = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Clicked");
                imgB.setTranslateX((Math.random()*600));
                imgB.setTranslateY((Math.random()*800));
            }
        };
        imgB.setOnAction(imgEV);

        IMFX.getChildren().add(imgB);
        IMFX.getChildren().add(imgT);
        stage.setScene(IS);
        stage.show();
    }

    public static void main(String[] args){
        launch();

    }

}
