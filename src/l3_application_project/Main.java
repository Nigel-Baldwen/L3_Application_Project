package l3_application_project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.GridPane;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        GridPane root = FXMLLoader.load(getClass().getResource("layout_details.fxml"));
        primaryStage.setTitle("L3 Application Project");
        primaryStage.setScene(new Scene(root, 1920, 1080));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
