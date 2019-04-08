package sample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;

public class Controller {
    @FXML
    Button edasi;
    ImageView pilt;
    @FXML
    CheckBox box;
    GridPane gridPane;

    public Controller() {
    }
    /* See siin PEAKS lisama pildi, aga miskit on tiba viga, kogu aeg läks selle peale
    siin raisku ja aeg sai otsa, ilma selleta aga raske teisi asju lahendada
    */
    public void pildiLisamine() throws FileNotFoundException {
        Image image = new Image(new FileInputStream("C:\\Users\\Asus\\IdeaProjects\\OneMoreTime\\VULVULs.jpg"));

        ImageView imageView = new ImageView(image);
        imageView.setX(0);
        imageView.setY(0);
        imageView.setFitHeight(400);
        imageView.setFitWidth(400);
        imageView.setPreserveRatio(true);
        imageView.setImage(image);
        StackPane root = new StackPane();
        root.getChildren().add(imageView);
    }

    //stseenivahetus
    @FXML
    void edasiAction() throws IOException {
        Main.changeScene("sample2.fxml");
        pildiLisamine();

    }
}
