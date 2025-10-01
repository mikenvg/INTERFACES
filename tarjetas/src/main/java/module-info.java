module com.proyectojavafx {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.proyectojavafx to javafx.fxml;
    exports com.proyectojavafx;
}
