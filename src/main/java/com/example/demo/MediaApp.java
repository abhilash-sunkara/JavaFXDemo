package com.example.demo;


import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import javafx.scene.media.MediaPlayer;

import java.io.File;
import java.net.MalformedURLException;

import static javafx.application.Application.launch;



public class MediaApp extends Application {

    @Override
    public void start(Stage stage) throws MalformedURLException {
        // Create and set the Scene.
        Scene scene = new Scene(new Group(), 540, 209);
        stage.setScene(scene);

        // Name and display the Stage.
        stage.setTitle("Hello Media");
        stage.show();

        // Create the media source.
        String source = "C:/Users/abhil/Downloads/Videos/Material/CantTellMeNothing.mp4";
        File f = new File("C:/Users/abhil/Downloads/Videos/Material/CantTellMeNothing.mp4");
        Media media = new Media(f.toURI().toURL().toString());

        // Create the player and set to play automatically.
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setAutoPlay(true);

        // Create the view and add it to the Scene.
        MediaView mediaView = new MediaView(mediaPlayer);
        ((Group) scene.getRoot()).getChildren().add(mediaView);
    }


    public static void main(String[] args) {
        launch();
    }

}
