package com.example.demo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class InputOutput extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("InputOutput");
        Group IOFX = new Group();
        Scene s = new Scene(IOFX, 320, 400);
        Text t = new Text("displays your text");
        t.setFill(Color.BLACK);
        t.setX(120);
        t.setY(50);

        TextField tf = new TextField("enter your text");
        EventHandler<ActionEvent> iFX = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                t.setText(tf.getText());
            }
        };
        tf.setOnAction(iFX);


        IOFX.getChildren().add(t);
        IOFX.getChildren().add(tf);
        stage.setScene(s);
        stage.show();


    }

    public static void main(String[] args){
        launch();
    }
}
