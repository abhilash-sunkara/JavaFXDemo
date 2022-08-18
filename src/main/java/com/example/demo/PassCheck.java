package com.example.demo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class PassCheck extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Password Checker");
        Group IFX = new Group();
        Scene intro = new Scene(IFX, 320, 400);
        Text t = new Text("Your Password is \"password\"");
        t.setX(80);
        t.setY(50);

        Group PFX = new Group();
        Scene passScreen = new Scene(PFX, 320, 400);


        Button nextB = new Button("click me to go the next page");
        nextB.setTranslateY(80);
        nextB.setTranslateX(80);
        EventHandler<ActionEvent> nextEV = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                stage.setScene(passScreen);
            }
        };
        nextB.setOnAction(nextEV);

        IFX.getChildren().add(t);
        IFX.getChildren().add(nextB);
        stage.setScene(intro);
        stage.show();
    }

    public static void main(String[] args){
        launch();
    }
}
