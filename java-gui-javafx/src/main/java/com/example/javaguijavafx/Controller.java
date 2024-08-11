package com.example.javaguijavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import com.example.javaguijavafx.model.Model; // Import the Model class

/**
 * Controller class for handling user interactions in the JavaFX application.
 */
public class Controller {

    // FXML components linked from the view
    @FXML
    private Button startButton; // This button might be used for future functionality or is unused in the current FXML

    @FXML
    private TextField nameField;       // TextField for the user's name
    @FXML
    private TextField emailField;      // TextField for the user's email
    @FXML
    private TextField phoneField;      // TextField for the user's phone
    @FXML
    private TextField libraryCardField; // TextField for the user's library card number
    @FXML
    private TextField titleField;      // TextField for the book title
    @FXML
    private TextField authorField;     // TextField for the book author

    /**
     * Method to handle the action of issuing a book when a button is clicked.
     *
     * @param event the ActionEvent triggered by the button click
     */
    @FXML
    public void handleIssueBook(ActionEvent event) {

        // Check if all fields are filled
        if (nameField.getText().isEmpty() || emailField.getText().isEmpty() || phoneField.getText().isEmpty() ||
                libraryCardField.getText().isEmpty() || titleField.getText().isEmpty() || authorField.getText().isEmpty()) {

            // Show an alert if any field is empty
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Input Validation Error");
            alert.setHeaderText(null);
            alert.setContentText("Please fill in all the fields before issuing the book.");
            alert.showAndWait();
            return;
        }

        // Capture data from input fields
        String name = nameField.getText();
        String email = emailField.getText();
        String phone = phoneField.getText();
        String libraryCard = libraryCardField.getText();
        String bookTitle = titleField.getText();
        String author = authorField.getText();

        // Create a Model instance with the captured data
        Model model = new Model(name, email, phone, libraryCard, bookTitle, author);

        // Handle the data (for now, print to console)
        System.out.println("Issuing Book:");
        System.out.println("Name: " + model.getName());
        System.out.println("Email: " + model.getEmail());
        System.out.println("Phone: " + model.getPhone());
        System.out.println("Library Card: " + model.getLibraryCard());
        System.out.println("Book Title: " + model.getBookTitle());
        System.out.println("Author: " + model.getAuthor());

        // You can add logic here to process the data, such as storing it or validating it

        // Show a confirmation alert to the user
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Book Issue Confirmation");
        alert.setHeaderText(null);
        alert.setContentText("You have issued the book. Please return it in 3 weeks.");
        alert.showAndWait();
    }
}
