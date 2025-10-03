package clases;

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
            Class.forName("com.mysql.jdbc.Driver");

            conectar = DriverManager.getConnection(cadena, usuario, contraseña);

        } catch (Exception e) {
            showAlert("Mensaje", "No se ha conectado a la base de datos, error: "+e.toString());
        }

        return conectar;
    }

    public void cerrarConexion(){
        try {
            if (conectar != null && !conectar.isClosed()) {
                conectar.close();
            }
        } catch (Exception e) {
            showAlert("Mensaje", "Error al cerrar conexion: "+e.toString());
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
