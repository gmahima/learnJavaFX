
import javafx.application.Application;
import javafx.beans.Observable;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.awt.*;

public class Listview {
    static ListView<String> lv;
    public static void display() {
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);

        window.setMinWidth(250);


        Button cb = new Button("X");

        lv = new ListView<>();
        lv.getItems().addAll("yu yu hakusho", "one punch man", "inuyasha", "soul eater", "bnha", "one piece", "ovari no seraf");
        lv.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        cb.setOnAction(e -> {
            buttonClick();


        });
        VBox layout = new VBox(lv, cb);

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();

    }
    private static void buttonClick() {
        String message = "";
        ObservableList<String> anime;
        anime = lv.getSelectionModel().getSelectedItems();
        for(String m: anime) {
            message += m + "\n";


        }
        System.out.println(message);

    }
}