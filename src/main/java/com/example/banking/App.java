package com.example.banking;

import com.example.banking.Views.ViewFactory;
import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        ViewFactory viewFactory = new ViewFactory();
        stage = viewFactory.getLoginView();
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
