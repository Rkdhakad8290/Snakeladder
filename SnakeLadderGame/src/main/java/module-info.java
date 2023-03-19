module com.example.snakeladdermarch {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.snakeladdermarch to javafx.fxml;
    exports com.example.snakeladdermarch;
}