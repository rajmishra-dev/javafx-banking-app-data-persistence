package com.example.banking.Controller.Client;

import com.example.banking.Model.User;
import com.example.banking.Views.ViewFactory;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class ClientController {
    
    @FXML
    private Label clientLabel;
    
    private User user;
    private ViewFactory viewFactory;
    
    public ClientController() {
        this.viewFactory = new ViewFactory();
    }
    
    @FXML
    void initialize() {
        // Initialization code if needed
    }
    
    public void setUser(User user) {
        this.user = user;
        clientLabel.setText("Welcome Client: " + user.getUsername());
    }
    
    @FXML
    void viewBalance(ActionEvent event) {
        showAlert("Account Balance", "Your account balance will be displayed here", Alert.AlertType.INFORMATION);
    }
    
    @FXML
    void deposit(ActionEvent event) {
        showAlert("Deposit", "Deposit feature will be implemented soon", Alert.AlertType.INFORMATION);
    }
    
    @FXML
    void withdraw(ActionEvent event) {
        showAlert("Withdraw", "Withdraw feature will be implemented soon", Alert.AlertType.INFORMATION);
    }
    
    @FXML
    void transfer(ActionEvent event) {
        showAlert("Transfer", "Transfer feature will be implemented soon", Alert.AlertType.INFORMATION);
    }
    
    @FXML
    void logout(ActionEvent event) {
        Stage stage = (Stage) clientLabel.getScene().getWindow();
        stage.close();
        
        Stage loginStage = viewFactory.getLoginView();
        loginStage.show();
    }
    
    private void showAlert(String title, String message, Alert.AlertType alertType) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
