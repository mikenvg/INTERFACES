package practica_javafx;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import java.io.IOException;

public class quinaryController {

    @FXML
    private Button botonAtras;

    @FXML
    private Button botonCarpeta;

    @FXML
    private Button botonPersona;

    @FXML
    private Button botonPapelera;

    @FXML
    private Button botonLupa;

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

        botonPersona.setOnAction(event -> {
            try {
                Parent secondRoot = FXMLLoader.load(getClass().getResource("/practica1/tertiary.fxml"));
                Stage stage = (Stage) botonPersona.getScene().getWindow();
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
    
}