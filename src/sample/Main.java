package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    static Stage stage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        changeScene("sample.fxml");

        primaryStage.setTitle("Hello World");
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

    static void changeScene(String fileName) throws IOException {
        FXMLLoader loader = new FXMLLoader(Main.class.getResource(fileName));
        Parent root = loader.load();
        Main.stage.setScene(new Scene(root, 300, 275));
    }
}
