module com.mycompany.tutorialb {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.tutorialb to javafx.fxml;
    exports com.mycompany.tutorialb;
}
