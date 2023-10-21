module com.ralfvanaert.knightclubbing {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.ralfvanaert.knightclubbing to javafx.fxml;
    exports com.ralfvanaert.knightclubbing;
}