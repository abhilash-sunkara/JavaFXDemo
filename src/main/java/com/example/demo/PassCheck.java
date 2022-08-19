package com.example.demo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class PassCheck extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Password Checker");
        String pass = "password";
        Group IFX = new Group();
        Scene intro = new Scene(IFX, 320, 400);
        Text t = new Text("Your Password is \"password\"");
        t.setX(80);
        t.setY(50);

        Group PFX = new Group();
        Scene passScreen = new Scene(PFX, 320, 400);

        Text tCheck = new Text("no password entered");
        tCheck.setY(100);

        TextField tf = new TextField("enter your password");
        EventHandler<ActionEvent> checkEV = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println(tf.getText());
                System.out.println(tf.getText().equals(pass));
                if (tf.getText().equals(pass)){
                    tCheck.setText("correct ");
                }
                else{
                    tCheck.setText("wrong");
                }
            }
        };
        tf.setOnAction(checkEV);



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
        PFX.getChildren().add(tf);
        PFX.getChildren().add(tCheck);
        stage.setScene(intro);
        stage.show();
    }

    public static void main(String[] args){
        launch();
    }
}
