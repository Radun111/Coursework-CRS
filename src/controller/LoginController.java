package controller;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class LoginController {
    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Label errorLabel;

    @FXML
    public void login() {
        // Hardcoded credentials for testing
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (username.equals("admin") && password.equals("12345")) {
            errorLabel.setText("Login Successful!");
            errorLabel.setStyle("-fx-text-fill: green;");
            errorLabel.setVisible(true);
        } else {
            errorLabel.setText("Invalid username or password!");
            errorLabel.setStyle("-fx-text-fill: red;");
            errorLabel.setVisible(true);
        }
    }

    @FXML
    public void reset() {
        usernameField.clear();
        passwordField.clear();
        errorLabel.setVisible(false);
    }
}
