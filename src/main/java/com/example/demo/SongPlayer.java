package com.example.demo;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

import java.io.File;

public class SongPlayer extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        stage.setTitle("Song Player");
        Group StartGroup = new Group();
        Scene main = new Scene(StartGroup, 320 , 400);


        System.out.println(StartGroup.getChildren());

    }

    public static void main(String[] args){
        launch();
    }
}
