
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
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import java.awt.*;

public class Treeview {
    static TreeView<String> tree;


    public static void display() {
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);

        window.setMinWidth(250);


        Button cb = new Button("X");
        cb.setOnAction(e -> {

        });
        TreeItem<String> root, shounen, shojo;
        //root
        root = new TreeItem<>();
        root.setExpanded(true);
        //shounen
        shounen = makeBranch("shounen", root);
        makeBranch("naruto", shounen);
        makeBranch("naruto", shounen);
        makeBranch("naruto", shounen);

        shojo = makeBranch("shojo", root);
        makeBranch("naruto", shojo);
        makeBranch("naruto", shojo);
        makeBranch("naruto", shojo);

        // tree
        tree = new TreeView<>(root);
        tree.setShowRoot(false);
        tree.getSelectionModel().selectedItemProperty().addListener((v, o, n) ->{
            if(n != null) {
                System.out.println(n);
            }
        });



        StackPane layout = new StackPane();
        layout.getChildren().add(tree);

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();

    }
    private static TreeItem<String> makeBranch(String title, TreeItem<String> parent) {
        TreeItem<String> item = new TreeItem<>(title);
        item.setExpanded(true);
        parent.getChildren().add(item);
        return item;

    }
}