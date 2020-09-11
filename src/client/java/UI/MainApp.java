package UI;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Button button = new Button("Sample button");

        AnchorPane pane = new AnchorPane();
        pane.setPrefWidth(200);
        pane.setPrefHeight(150);
        pane.getChildren().add(button);

        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        
        primaryStage.setResizable(false);
        primaryStage.show();

    }
}
