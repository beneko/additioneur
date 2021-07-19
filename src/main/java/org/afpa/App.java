package org.afpa;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("Hello");
        Button button = new Button("Add");
        button.setOnAction(event -> {
            label.setText("Hello worl!");
        });
        VBox root = new VBox();

        root.getChildren().add(label);
        root.getChildren().add(button);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
