module com.example.apfi {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.apfi to javafx.fxml;
    exports com.example.apfi;
}