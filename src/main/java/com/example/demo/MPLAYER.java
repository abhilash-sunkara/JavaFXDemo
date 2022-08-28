package com.example.demo;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import javafx.scene.media.MediaPlayer;

import static javafx.application.Application.launch;

public class MPLAYER {



    public class MediaApp extends Application {

        @Override
        public void start(Stage stage) throws Exception {
            stage.setTitle("Media");
            Group MFX = new Group();
            Scene MediaScene = new Scene(MFX, 320, 400);

            Media m = new Media("C:/Users/abhil/Downloads/Videos/Material/Can't Tell Me Nothing.mp4");

            MediaPlayer MP = new MediaPlayer(m);

            MediaView MV = new MediaView(MP);

            MFX.getChildren().add(MV);



            stage.setScene(MediaScene);
        }
    }

    public static void main(String[] args){
        launch();
    }

}
