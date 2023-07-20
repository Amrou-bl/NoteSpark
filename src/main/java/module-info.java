module com.rdouda.notespark {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.rdouda.notespark to javafx.fxml;
    exports com.rdouda.notespark;
    exports com.rdouda.notespark.controllers;
    opens com.rdouda.notespark.controllers to javafx.fxml;
}