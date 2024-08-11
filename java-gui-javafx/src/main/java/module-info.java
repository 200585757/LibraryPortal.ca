module com.example.javaguijavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.javaguijavafx to javafx.fxml;
    exports com.example.javaguijavafx;
}