package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.net.URL;

public class MainMenu extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        URL url = MainMenu.class.getResource("/FXML/MainMenu.fxml");
        assert url!=null;
        FXMLLoader fxmlLoader = new FXMLLoader(url);
        BorderPane borderPane = fxmlLoader.load();
        Scene scene = new Scene(borderPane);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
