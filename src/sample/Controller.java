package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Controller {

    @FXML
    void switchScene(Stage stage) throws IOException {
        Parent leht = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene aken = new Scene(leht);
        stage.setScene(aken);
        stage.show();
    }

    void MineTeiseleLehele(ActionEvent event) throws IOException {
        Parent teineLeht = FXMLLoader.load(getClass().getResource("avaleht.fxml"));
        Scene mänguLeht = new Scene(teineLeht);
        Stage aken = (Stage) ((Node) event.getSource()).getScene().getWindow();
        aken.setScene(mänguLeht);
        aken.show();
    }

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
    void määraPilt() {
        pilt.setImage(null);

    }

    @FXML
    void tiripilt() {
        System.out.println("oki");
    }

}
