package sniffy;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;

public class PageOneEnglish {

    public PageOneEnglish(Stage primaryStage){

        Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        //double width = screenSize.getWidth()/2;
        //double height = screenSize.getHeight();
        double width = 573;
        double height = 1018;


        try {
            Parent root = FXMLLoader.load(getClass().getResource("PageOneEnglish.fxml"));
            Scene scene1 = new Scene(root, width, height);
            scene1.getStylesheets().add("css/SniffyStyles.css");
            primaryStage.setScene(scene1);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
