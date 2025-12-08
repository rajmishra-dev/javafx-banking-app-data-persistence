package com.example.banking.Controller;

import com.example.banking.Model.User;
import com.example.banking.Views.ViewFactory;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Login {
    
    @FXML
    private TextField usernameField;
    
    @FXML
    private PasswordField passwordField;
    
    private ViewFactory viewFactory;
    
    public Login() {
        this.viewFactory = new ViewFactory();
    }
    
    @FXML
    void loginAsClient(ActionEvent event) {
        String username = usernameField.getText();
        String password = passwordField.getText();
        
        User user = new User(username, password, "Client");
        
        if (username.isEmpty() || password.isEmpty()) {
            showAlert("Login Error", "Please enter username and password", Alert.AlertType.ERROR);
            return;
        }
        
        // Get current window and close it
        Stage stage = (Stage) usernameField.getScene().getWindow();
        stage.close();
        
        // Open Client View
        Stage clientStage = viewFactory.getClientView(user);
        clientStage.show();
    }
    
    @FXML
    void loginAsAdmin(ActionEvent event) {
        String username = usernameField.getText();
        String password = passwordField.getText();
        
        // Default admin credentials
        if (!username.equals("admin") || !password.equals("admin123")) {
            showAlert("Login Error", "Invalid admin credentials", Alert.AlertType.ERROR);
            return;
        }
        
        User user = new User(username, password, "Admin");
        
        // Get current window and close it
        Stage stage = (Stage) usernameField.getScene().getWindow();
        stage.close();
        
        // Open Admin View
        Stage adminStage = viewFactory.getAdminView(user);
        adminStage.show();
    }
    
    private void showAlert(String title, String message, Alert.AlertType alertType) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
