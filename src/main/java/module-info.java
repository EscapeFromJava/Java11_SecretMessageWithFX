module com.example.java11_javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.java11_secretMessageWithFX to javafx.fxml;
    exports com.example.java11_secretMessageWithFX;
}