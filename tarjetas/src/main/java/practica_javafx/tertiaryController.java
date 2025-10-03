package practica_javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;

public class tertiaryController {

    @FXML
    private Button botonAtras;

    @FXML
    private Button botonCarpeta;

    @FXML
    private Button botonPapelera;

    @FXML
    private Button botonLapiz;

    @FXML
    private Button botonLupa;


    @FXML
    private TextField txtNombres;

    @FXML
    private TextField txtApellidos;

    @FXML
    private TextField txtEdad;

    @FXML
    private TextField txtPosicion;

    @FXML
    private TextField txtClub;

    @FXML
    public void initialize() {

        botonAtras.setOnAction(event -> {
            try {
                Parent secondRoot = FXMLLoader.load(getClass().getResource("/practica1/Primary.fxml"));
                Stage stage = (Stage) botonAtras.getScene().getWindow();
                stage.setScene(new Scene(secondRoot, 785, 451));
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        
        botonCarpeta.setOnAction(event -> {
            try {
                Parent secondRoot = FXMLLoader.load(getClass().getResource("/practica1/secondary.fxml"));
                Stage stage = (Stage) botonCarpeta.getScene().getWindow();
                stage.setScene(new Scene(secondRoot, 785, 451));
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        botonPapelera.setOnAction(event -> {
            try {
                Parent secondRoot = FXMLLoader.load(getClass().getResource("/practica1/quaternary.fxml"));
                Stage stage = (Stage) botonPapelera.getScene().getWindow();
                stage.setScene(new Scene(secondRoot, 785, 451));
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        botonLapiz.setOnAction(event -> {
            try {
                Parent secondRoot = FXMLLoader.load(getClass().getResource("/practica1/quinary.fxml"));
                Stage stage = (Stage) botonLapiz.getScene().getWindow();
                stage.setScene(new Scene(secondRoot, 785, 451));
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        botonLupa.setOnAction(event -> {
            try {
                Parent secondRoot = FXMLLoader.load(getClass().getResource("/practica1/senary.fxml"));
                Stage stage = (Stage) botonLupa.getScene().getWindow();
                stage.setScene(new Scene(secondRoot, 785, 451));
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    @FXML
    private void guardarJugador (ActionEvent ecvent){
        clases.Jugadores objetoJugadores = new clases.Jugadores();
        objetoJugadores.AgregarJugador(txtNombres, txtApellidos, txtEdad, txtPosicion, txtClub);
    }
    
}
