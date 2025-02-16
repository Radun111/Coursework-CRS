package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class RegisterCoursesController {

    @FXML
    private TextField courseNameField;

    @FXML
    private TextField courseCodeField;

    @FXML
    private Button registerButton;

    @FXML
    private void handleRegisterButtonClick() {
        String courseName = courseNameField.getText();
        String courseCode = courseCodeField.getText();

        if (courseName.isEmpty() || courseCode.isEmpty()) {
            showAlert("Error", "Please fill in all fields!");
        } else {
            showAlert("Success", "Course Registered: " + courseName + " (" + courseCode + ")");
        }
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
