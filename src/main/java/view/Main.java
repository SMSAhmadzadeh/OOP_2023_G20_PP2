package view;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    //put controller classes...
    public static Stage stage;

    static {
        //import history
    }
    public static void main(String[] args) {
        MainMenu.main(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Main.stage=stage;


    }
}
