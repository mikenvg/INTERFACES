package com.proyectojavafx.clases;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;
import java.sql.CallableStatement;

public class Jugadores {
    
    private void showAlert(String title, String content){
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }

    public void AgregarJugador(TextField nombre, TextField apellidos, TextField edad, TextField posicion, TextField club){
        Conexion objetoConexion = new Conexion();
        String consulta = "INSERT INTO Jugadores (nombre, apellidos, edad, posicion, club) VALUES (?, ?, ?, ?, ?)";

        try {
            CallableStatement cs = objetoConexion.estableceConexion().prepareCall(consulta);
            cs.setString(1, nombre.getText());
            cs.setString(2, apellidos.getText());
            cs.setInt(3, Integer.parseInt(edad.getText()));
            cs.setString(4, posicion.getText());
            cs.setString(5, club.getText());

            cs.execute();
            showAlert("Éxito", "Jugador guardado correctamente!");
            
        } catch (Exception e) {
            showAlert("Error", "Error al guardar: "+e.getMessage());
        } finally {
            objetoConexion.cerrarConexion();
        }
    }
}