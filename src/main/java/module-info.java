module com.example.rupizzeria {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.rupizzeria to javafx.fxml;
    exports com.example.rupizzeria;
}