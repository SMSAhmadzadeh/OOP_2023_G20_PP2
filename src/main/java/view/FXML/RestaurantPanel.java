package view.FXML;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import view.LoginMenu;

import java.io.IOException;
import java.net.URL;

public class RestaurantPanel extends BorderPane {
    /*@FXML
    private Button button;*/
    public RestaurantPanel(){
        URL url = RestaurantPanel.class.getResource("/FXML/Customs/RestaurantPanel.fxml");
        FXMLLoader fxmlLoader = new FXMLLoader(url);
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try{
            fxmlLoader.load();
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    public void setText(String string){
        //button.setText(string);
    }
}
