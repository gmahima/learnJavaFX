

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
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import java.awt.*;

public class ConfirmBox {
    public static void display() {
        Stage window = new Stage();
        window.setTitle("confirmBox");
        Button y = new Button("yes");
        y.setOnAction(e -> System.out.print("y"));
        Button n = new Button("no");
        n.setOnAction(e -> System.out.print("n"));
        HBox hb = new HBox(20);
        hb.getChildren().addAll(y, n);
        Scene scene = new Scene(hb, 300, 300);
        window.setScene(scene);
        window.show();
    }

}
