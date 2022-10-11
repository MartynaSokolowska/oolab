module com.example.oolab {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.oolab to javafx.fxml;
    exports com.example.oolab;
}