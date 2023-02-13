module is.hi.verkefni {
    requires javafx.controls;
    requires javafx.fxml;

    opens is.hi.verkefni to javafx.fxml;
    exports is.hi.verkefni;
}
