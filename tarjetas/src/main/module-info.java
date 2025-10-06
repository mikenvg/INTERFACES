module com.proyectojavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.desktop;

    opens com.proyectojavafx to javafx.fxml;
    opens com.proyectojavafx.clases to javafx.fxml;
    exports com.proyectojavafx;
    exports com.proyectojavafx.clases;
}