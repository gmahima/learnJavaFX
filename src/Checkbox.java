
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.control.Label;

import java.awt.*;

public class Checkbox {
    public static void display() {
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("checkbox");
        window.setMinWidth(250);

        CheckBox a = new CheckBox("Tomato");
        CheckBox b = new CheckBox("Cucumber");
        b.setSelected(true);


        Button ok = new Button("ok");
        ok.setOnAction(e -> {
            handleOptions(a, b);

        });
        VBox layout = new VBox();
        layout.getChildren().addAll(a, b, ok);


        Scene scene = new Scene(layout, 300, 300);
        window.setScene(scene);
        window.showAndWait();

    }
    private static void handleOptions(CheckBox a, CheckBox b) {
        String message = "order:";
        if(a.isSelected()) {
            message += "tomato";
        }
        if(b.isSelected()) {
            message += "cucumber";
        }

        System.out.print(message);

    }

}

