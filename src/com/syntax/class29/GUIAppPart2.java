package com.syntax.class29;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.awt.*;

public class GUIAppPart2 extends Application implements EventHandler<ActionEvent> {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Button button=new Button("Click me");
        Label label=new Label("Enter your name");
        TextField text=new TextField("Enter your name");
        VBox vBoxLayout=new VBox();
        vBoxLayout.getChildren().add(label);
        button.setOnAction(this);
        vBoxLayout.getChildren().add(text);
        vBoxLayout.getChildren().add(button);
        Scene scene=new Scene(vBoxLayout,600,600);
        primaryStage.setTitle("Next Billion Dollar App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @Override
    public void handle(ActionEvent event) {
        
    }
}
