module com.example.rdesk {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.rdesk to javafx.fxml;
    exports com.example.rdesk;
}