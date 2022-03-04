module com.uvdn1.uvdn1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.uvdn1.uvdn1 to javafx.fxml;
    exports com.uvdn1.uvdn1;
}