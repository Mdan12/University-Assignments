module hi.vinnsla {
    requires javafx.controls;
    requires javafx.fxml;

    opens hi.vinnsla to javafx.fxml;
    exports hi.vinnsla;
}
