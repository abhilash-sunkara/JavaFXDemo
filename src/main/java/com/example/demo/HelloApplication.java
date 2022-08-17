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
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.text.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws FileNotFoundException {
        Group root = new Group();
        Group rootv2 = new Group();

        //FileInputStream input = new FileInputStream("resources/breach.jpg");
        //Image image = new Image(input);
        //ImageView imageView = new ImageView(image);

        Scene s = new Scene(root, 320, 240);
        stage.setTitle("Hello!");
        Rectangle r = new Rectangle(100,100,100,100);
        Button b = new Button("click me to switch the scene");

        root.setLayoutX(100);


        Scene sv2 = new Scene(rootv2, 320, 240);
        Rectangle rv2 = new Rectangle(100, 100, 100, 100);
        rv2.setFill(Color.BLUE);
        Button bv2 = new Button("click me to switch the scene back");
        EventHandler<ActionEvent> eventv2 = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                stage.setScene(s);
            }
        };

        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                stage.setScene(sv2);
            }
        };

        b.setOnAction(event);
        bv2.setOnAction(eventv2);

        rootv2.getChildren().add(rv2);
        rootv2.getChildren().add(bv2);




        root.getChildren().add(r);
        root.getChildren().add(b);
        stage.setScene(s);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}