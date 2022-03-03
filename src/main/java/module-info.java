module com.example.uvdn1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.uvdn1 to javafx.fxml;
    exports com.example.uvdn1;
}