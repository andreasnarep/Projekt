package sample;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller2 {
    @FXML
    Button tagasi;
    @FXML
    CheckBox box;
    @FXML
    ImageView pilt;
    Image muld;

    //ei tööta
   // public Controller2() throws IOException{
        //GridPane gridPane = new GridPane();
      //  FileInputStream stream = new FileInputStream("C:\\Users\\Asus\\IdeaProjects\\OneMoreTime\\VULVULs.jpg");
        //Image muld = new Image(stream);
       // pilt.setImage(muld);
       // gridPane.getChildren().add(new ImageView(muld));
   // }

    //Vahetab lihtsalt tagasi põhiekraanile
    @FXML
    void tagasiAction() throws IOException {
        Main.changeScene("sample.fxml");

    }

}
