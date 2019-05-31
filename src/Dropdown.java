
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.beans.value.ChangeListener;
import javafx.scene.control.Label;
import java.awt.*;

public class Dropdown {

    public static void display() {
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);

        window.setMinWidth(250);



        ChoiceBox<String> choiceBox = new ChoiceBox<>();

        choiceBox.getItems().addAll("apple", "mango", "peach", "cherry", "pineapple");
        choiceBox.setValue("apple");

        choiceBox.getSelectionModel().selectedItemProperty().addListener((v, oldValue, newValue) -> {
            System.out.println(v);
            System.out.println("old: " + oldValue);
            System.out.println("new: " + newValue);
        });




        Button cb = new Button("X");
        cb.setOnAction(e -> {
            getChoice(choiceBox);

        });

        VBox layout = new VBox(20);
        layout.getChildren().addAll(choiceBox, cb);
        layout.setAlignment(Pos.CENTER);


        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();

    }
    private static void getChoice(ChoiceBox<String> choiceBox) {
        String fruit  = choiceBox.getValue();
        System.out.print(fruit);
    }
}
