package Lab15;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("Lab15fxml.fxml"));
        primaryStage.setTitle("Lab15");
        primaryStage.setScene(new Scene(root, 450, 400));
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}