package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;

import java.io.IOException;

public class ControllerTagasi {
    @FXML
    Button tagasi;
    @FXML
    CheckBox box;

    @FXML
    void tagasiAction() throws IOException {
        Main.changeScene("avaleht.fxml");
    }
}
