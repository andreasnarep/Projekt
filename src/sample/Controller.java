package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Controller {
    @FXML
    ImageView pilt;
    Button nupp;

    @FXML
    public void initialize() throws FileNotFoundException {
        FileInputStream stream = new FileInputStream("VULVULs.jpg");
        Image image = new Image(stream);
        pilt.setImage(image);
    }

    @FXML
    void määraPilt() throws FileNotFoundException {
        pilt.setImage(null);

    }
    @FXML
    void tiripilt(){
        System.out.println("ok");
    }
}
