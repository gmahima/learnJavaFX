import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import java.awt.*;

public class Main extends Application {
    Stage window;
    Scene scene1, scene2;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
 //       Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        window = primaryStage;

        Label label1 = new Label("welcome to scene 1");
        Button b1 = new Button("go to scene 2");
        b1.setOnAction(e -> window.setScene(scene2));

        Button b3 = new Button("save");
        b3.setOnAction(e -> closeProg());

        VBox l1 = new VBox(20);
        l1.getChildren().addAll(label1, b1, b3);
        scene1 = new Scene(l1, 200, 200);


        Button b2 = new Button("go to confirmbox");
        b2.setOnAction(e -> {
            Listview.display();

        });

        StackPane l2 = new StackPane();
        l2.getChildren().addAll(b2);
        scene2 = new Scene(l2, 300, 200);

        window.setScene(scene1);
        window.setTitle("switch scene");
        window.setOnCloseRequest(e -> {
            e.consume();
            closeProg();
        });
        window.show();


    }
    private void closeProg() {
        Boolean answer = ConfirmBox.display("title", "sure?");
        if(answer) {
            System.out.print("saved");
            window.close();
        }

    }



}
