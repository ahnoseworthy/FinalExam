module ca.georgiancollege.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens ca.georgiancollege.demo to javafx.fxml;
    exports ca.georgiancollege.demo;
}