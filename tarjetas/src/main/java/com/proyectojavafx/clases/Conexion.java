package com.proyectojavafx.clases;

import java.sql.Connection;
import java.sql.DriverManager;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class Conexion {
    Connection conectar = null;

    String usuario = "root";
    String contraseña = "8944";
    String bd = "Fichas";
    String ip = "localhost";
    String puerto = "3306";

    String cadena = "jdbc:mysql://"+ip+":"+puerto+"/"+bd;

    public Connection estableceConexion(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Driver actualizado
            conectar = DriverManager.getConnection(cadena, usuario, contraseña);
        } catch (Exception e) {
            showAlert("Error", "No se ha conectado a la base de datos: "+e.getMessage());
        }
        return conectar;
    }

    public void cerrarConexion(){
        try {
            if (conectar != null && !conectar.isClosed()) {
                conectar.close();
            }
        } catch (Exception e) {
            showAlert("Error", "Error al cerrar conexión: "+e.getMessage());
        }
    }

    private void showAlert(String title, String content){
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }
}