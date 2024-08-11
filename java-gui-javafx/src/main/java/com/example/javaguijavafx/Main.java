package com.example.javaguijavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.Parent;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Set the title of the primary stage (window)
        primaryStage.setTitle("Library Portal");

        // Create a button for the initial scene
        Button button = new Button("Proceed!");

        // Create a label for displaying messages
        Label label = new Label();

        // Set up the button's action to update the label with a welcome message
        button.setOnAction(e -> label.setText("Welcome to the Toronto Library!"));

        // Create another button for navigating to the next scene
        Button button1 = new Button("Next!");

        // Create a VBox layout with 10px spacing between elements and center alignment
        VBox layout = new VBox(10);
        layout.setAlignment(Pos.CENTER);

        // Add the buttons and label to the VBox layout
        layout.getChildren().addAll(button, label, button1);

        // Create the initial scene with the VBox layout, specifying its dimensions
        Scene initialScene = new Scene(layout, 300, 250);

        // Load the FXML file for the next scene
        FXMLLoader loader = new FXMLLoader(getClass().getResource("view.fxml"));

        // Load the FXML file into a Parent object to define the new scene's root node
        Parent root = loader.load();

        // Create a new scene with the loaded FXML root node, specifying its dimensions
        Scene libraryScene = new Scene(root, 600, 400);

        // Set up the action to switch from the initial scene to the library scene when button1 is clicked
        button1.setOnAction(e -> primaryStage.setScene(libraryScene));

        // Set the initial scene to be displayed in the primary stage
        primaryStage.setScene(initialScene);

        // Show the primary stage with the initial scene
        primaryStage.show();
    }

    // Main method to launch the JavaFX application
    public static void main(String[] args) {
        launch(args);
    }
}
