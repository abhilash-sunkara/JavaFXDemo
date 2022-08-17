package com.example.demo;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MovementFX extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("MovementFX");

        Group MFX = new Group();
        Scene s = new Scene(MFX, 320, 240);
        Text txt = new Text(140, 20, "Click");
        Group UG = new Group();
        Button ub = new Button("click");

        UG.getChildren().add(ub);

        MFX.getChildren().add(txt);

        stage.setScene(s);
        stage.show();
    }

    public static void main(String[] args){
        launch();
    }
}
