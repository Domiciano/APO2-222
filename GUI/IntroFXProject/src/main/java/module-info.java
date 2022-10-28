module com.example.introfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.introfx to javafx.fxml;
    exports com.example.introfx;
    exports com.example.introfx.control;
    opens com.example.introfx.control to javafx.fxml;
}