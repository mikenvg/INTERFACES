package clases;

import java.io.FileInputStream;
import java.util.concurrent.Callable;
import java.sql.CallableStatement;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;

public class Jugadores {
    
    private void showAlert(String title, String content){
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }


    public void AgregarJugador(TextField nombre, TextField apellidos, TextField edad, TextField posicion, TextField club){

        clases.Conexion objetoConexion = new clases.Conexion();

        String consulta = "insert into Jugadores (nombre,apellidos,edad,posicion,club) values (?,?,?,?,?)";

        try (CallableStatement cs = objetoConexion.estableceConexion().prepareCall(consulta)) {
            cs.setString(1, nombre.getText());
            cs.setString(2, apellidos.getText());
            cs.setString(3, edad.getText());
            cs.setString(4, posicion.getText());
            cs.setString(5, club.getText());

            cs.execute();
            showAlert("Informacion", "Jugador guardado correctamente!");
            
        } catch (Exception e) {
            showAlert("Informacion", "Error al guardar "+e.toString());
        } finally {
            objetoConexion.cerrarConexion();
        }
    }
}
