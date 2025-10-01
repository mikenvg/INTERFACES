module com.proyectojavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires charm.glisten; // Para Gluon Charm
    
    opens com.proyectojavafx to javafx.fxml;
    exports com.proyectojavafx;
}