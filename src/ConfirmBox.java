

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
    public static Boolean answer;
    public static boolean display(String title, String message) {
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);

        window.setTitle(title);
        Label label = new Label();
        label.setText(message);
        Button y = new Button("yes");
        y.setOnAction(e -> {
            answer = true;
            window.close();
        });
        Button n = new Button("no");
        n.setOnAction(e -> {
            answer = false;
            window.close();
        });
        VBox vb = new VBox(20);
        HBox hb = new HBox(20);
        hb.getChildren().addAll(y, n);
        vb.getChildren().addAll(label, hb);
        Scene scene = new Scene(vb, 300, 300);
        window.setScene(scene);
        window.showAndWait(); //show() throws null pointer exception
        return answer;
    }

}
