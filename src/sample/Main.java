package sample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
    static Stage stage;

    public Main() {
    }
    @Override
    public void start(Stage primaryStage) throws Exception {

        stage = primaryStage;
        new FXMLLoader(this.getClass().getResource("sample.fxml"));
        changeScene("sample.fxml");
        stage.setTitle("Hello World");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    //stseenivahetus
    static void changeScene(String fileName) throws IOException {
        FXMLLoader loader = new FXMLLoader(Main.class.getResource(fileName));
        Parent root = (Parent)loader.load();
        stage.setScene(new Scene(root, 800.0D, 775.0D));

    }
    /*
    Elementide liitmise saab teha lihtsa if- iga ära, et kas y ja x on õiged
    elemendid, et neid liita, if (x==muld AND y==vesi) ja saab OR-i juurde, et
    ta vastupidi saaks ka aru.
    Mängule endale ilmuks tekstike, mis küsib, mis elemente soovid liita, kirjutad
    kirjutad teise, voila, uus element reveal'itakse.
    Algselt oleks selle lahendanud ära drag'imisega, et kui hiir enam ei liiguta
    pilti, ja piltide Panelid üksteist puudutavad, et siis elemendid kombineeruvad
    */
}
