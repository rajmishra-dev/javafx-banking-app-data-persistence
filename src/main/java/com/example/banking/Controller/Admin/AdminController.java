package com.example.banking.Controller.Admin;

import com.example.banking.Model.User;
import com.example.banking.Views.ViewFactory;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class AdminController {
    
    @FXML
    private Label adminLabel;
    
    private User user;
    private ViewFactory viewFactory;
    
    public AdminController() {
        this.viewFactory = new ViewFactory();
    }
    
    @FXML
    void initialize() {
        // Initialization code if needed
    }
    
    public void setUser(User user) {
        this.user = user;
        adminLabel.setText("Welcome Admin: " + user.getUsername());
    }
    
    @FXML
    void manageCustomers(ActionEvent event) {
        showAlert("Manage Customers", "Manage Customers feature will be implemented soon", Alert.AlertType.INFORMATION);
    }
    
    @FXML
    void viewAllAccounts(ActionEvent event) {
        showAlert("View Accounts", "View All Accounts feature will be implemented soon", Alert.AlertType.INFORMATION);
    }
    
    @FXML
    void viewTransactions(ActionEvent event) {
        showAlert("View Transactions", "View Transactions feature will be implemented soon", Alert.AlertType.INFORMATION);
    }
    
    @FXML
    void logout(ActionEvent event) {
        Stage stage = (Stage) adminLabel.getScene().getWindow();
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
