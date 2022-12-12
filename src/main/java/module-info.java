module com.example.customcontrols1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.customcontrols1 to javafx.fxml;
    exports com.example.customcontrols1;
}