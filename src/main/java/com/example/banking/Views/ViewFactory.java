package com.example.banking.Views;

import com.example.banking.Controller.Admin.AdminController;
import com.example.banking.Controller.Client.ClientController;
import com.example.banking.Controller.Login;
import com.example.banking.Model.User;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class ViewFactory {
    
    public Stage getLoginView() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Objects.requireNonNull(ViewFactory.class.getResource("/Fxml/Login.fxml")));
            Scene scene = new Scene(fxmlLoader.load(), 600, 400);
            Stage stage = new Stage();
            stage.setTitle("Banking Application - Login");
            stage.setScene(scene);
            return stage;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public Stage getAdminView(User user) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Objects.requireNonNull(ViewFactory.class.getResource("/Fxml/Admin/Admin.fxml")));
            Scene scene = new Scene(fxmlLoader.load(), 800, 600);
            Stage stage = new Stage();
            stage.setTitle("Banking Application - Admin Panel");
            stage.setScene(scene);
            
            AdminController controller = fxmlLoader.getController();
            controller.setUser(user);
            
            return stage;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public Stage getClientView(User user) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Objects.requireNonNull(ViewFactory.class.getResource("/Fxml/Client/Clinet.fxml")));
            Scene scene = new Scene(fxmlLoader.load(), 800, 600);
            Stage stage = new Stage();
            stage.setTitle("Banking Application - Client Dashboard");
            stage.setScene(scene);
            
            ClientController controller = fxmlLoader.getController();
            controller.setUser(user);
            
            return stage;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
