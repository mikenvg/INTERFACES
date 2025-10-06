package com.proyectojavafx;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class QuinaryController implements Initializable {

    @FXML private Button btnAtras;
    @FXML private Button btnModificar;
    @FXML private Button btnDestacar;
    @FXML private Button btnEliminar;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        configurarBotones();
    }

    private void configurarBotones() {
        btnAtras.setOnAction(event -> {
            try {
                App.setRoot("primary");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        btnModificar.setOnAction(event -> {
            try {
                App.setRoot("secondary");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        btnDestacar.setOnAction(event -> {
            try {
                App.setRoot("tertiary");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        btnEliminar.setOnAction(event -> {
            try {
                App.setRoot("quaternary");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
}