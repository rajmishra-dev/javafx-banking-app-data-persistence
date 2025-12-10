module com.jmc.mazebank{
    requies javafx.controls;
    requies javafx.fxml;
    require de.jensd.fx.glyphs.fontawesome;
    requies java.sql;
    requies org.xerial.sqlitejdbc;

    Opens  java.com.example.banking to javafx.fxml;
    export java.com.example.banking;
    export java.com.example.banking.Controller;
    export java.com.example.banking.Controller.Admin;
    export java.com.example.banking.Controller.Client;
    export java.com.example.banking.Model;
    export java.com.example.banking.Views;
    
}