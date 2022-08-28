package com.example.demo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MovementFX extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("MovementFX");

        Group MFX = new Group();

        Scene s = new Scene(MFX, 400, 320);



        Rectangle mr = new Rectangle(100,100);
        mr.setFill(Color.CYAN);
        mr.setY(200);
        mr.setX(100);
        final double[] curX = {mr.getX()};
        final double[] curY = {mr.getY()};


        Button ub = new Button("click to move up");
        ub.setTranslateX(100);
        EventHandler<ActionEvent> ubev = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                mr.setY(curY[0] - 20);
                curY[0] = mr.getY();
            }
        };
        ub.setOnAction(ubev);

        Button db = new Button("click to move down");
        db.setTranslateX(100);
        db.setTranslateY(50);
        EventHandler<ActionEvent> dbev = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                mr.setY(curY[0] + 20);
                curY[0] = mr.getY();
            }
        };
        db.setOnAction(dbev);

        Button rb = new Button("click to move right");
        rb.setTranslateX(150);
        rb.setTranslateY(25);
        EventHandler<ActionEvent> rbev = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                mr.setX(curX[0] + 20);
                curX[0] = mr.getX();
            }
        };
        rb.setOnAction(rbev);

        Button lb = new Button("click to move up");
        lb.setTranslateX(50);
        lb.setTranslateY(25);
        EventHandler<ActionEvent> lbev = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                mr.setX(curX[0] - 20);
                curX[0] = mr.getX();
            }
        };
        lb.setOnAction(lbev);

        MFX.getChildren().add(ub);
        MFX.getChildren().add(db);
        MFX.getChildren().add(rb);
        MFX.getChildren().add(lb);
        MFX.getChildren().add(mr);

        stage.setScene(s);
        stage.show();
    }

    public static void main(String[] args){
        launch();
    }
}
