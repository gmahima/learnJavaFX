
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import java.awt.*;

public class g {
    public static void display() {
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("gridpane");
        window.setMinWidth(250);
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(8);
        grid.setHgap(10);
        Label nameLabel = new Label();
        nameLabel.setText("user name");
        GridPane.setConstraints(nameLabel, 0, 0);
        TextField nameInput = new TextField("Mahima");
        GridPane.setConstraints(nameInput, 1, 0);
        Label passLabel = new Label();
        passLabel.setText("password");
       GridPane.setConstraints(passLabel, 0, 1);
        TextField passInput = new TextField();
        passInput.setPromptText("password");
        GridPane.setConstraints(passInput, 1, 1);
        Button login = new Button("login");
        login.setOnAction(e -> {
            isInt(nameInput, nameInput.getText());
        });
        GridPane.setConstraints(login, 1, 2);

        grid.getChildren().addAll(nameLabel, passLabel, nameInput, passInput, login);


        Scene scene = new Scene(grid, 300, 300);
        window.setScene(scene);
        window.showAndWait();

    }
    private static boolean isInt(TextField input, String message) {
        try {
            int age = Integer.parseInt(input.getText());
            System.out.println(age);
            return true;


        } catch(NumberFormatException e) {
            System.out.print("error:" + message + "is not a number");
            return false;
        }

    }
}
