
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.ComboBox;
import java.awt.*;

public class Combobox {
    static ComboBox <String> comboBox;
    public static void display() {
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);

        window.setMinWidth(250);


        Button cb = new Button("X");
        comboBox = new ComboBox<>();



        comboBox.getItems().addAll(
                "naruto",
                "hunter x hunter",
                "inuyasha"
        );
        comboBox.setPromptText("fav anime");
        comboBox.setEditable(true);

        cb.setOnAction(e -> {
            printAnime();

        });

        comboBox.setOnAction(e -> System.out.print(comboBox.getValue()));





        VBox layout = new VBox(comboBox, cb);

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();

    }
    private static void printAnime() {
        System.out.print(comboBox.getValue());
    }
}