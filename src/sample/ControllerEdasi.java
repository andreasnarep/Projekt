package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;

import java.io.IOException;

public class ControllerEdasi {

    @FXML
    Button mängima;
    @FXML
    CheckBox box;

    @FXML
    void edasiAction() throws IOException {
        Main.changeScene("sample.fxml");
    }
}
