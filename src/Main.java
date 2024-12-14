import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    TextField bill;
    Slider tip;
    TextField party;
    TextField total;
    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Tip Calculator");

        bill = new TextField();
        tip = new Slider();
        party = new TextField();
        total = new TextField();
        button = new Button();


        StackPane layout = new StackPane();


        layout.getChildren().add(bill);
        layout.getChildren().add(tip);
        layout.getChildren().add(party);
        layout.getChildren().add(total);
        layout.getChildren().add(button);

        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}