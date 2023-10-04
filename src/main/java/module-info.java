module dk.easv.mytodoapplication {
    requires javafx.controls;
    requires javafx.fxml;


    opens dk.easv.mytodoapplication to javafx.fxml;
    exports dk.easv.mytodoapplication;
}