package sniffy;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;

public class PageTwo {

    public PageTwo(Stage primaryStage){

        Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        //double width = screenSize.getWidth()/2;
        //double height = screenSize.getHeight();
        double width = 573;
        double height = 1018;

        try {
            Parent root = FXMLLoader.load(getClass().getResource("PageTwo.fxml"));
            Scene scene = new Scene(root, width, height);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
