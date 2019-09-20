package demo;


import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Recipe02_01 extends Application {

    final Group  root = new Group();

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Hello Lambda");
        Scene scene = new Scene(root,300,300);
        Button  btn = new Button();
        Label message = new Label();
        btn.setLayoutX(60);
        btn.setLayoutY(60);
        btn.setText("Invoke Lambda Exception");
        btn.setOnAction((event)->{message.setText("Lambda expression invoked!");});
        root.getChildren().add(btn);
        message.setLayoutX(300/2-90);
        message.setLayoutY(30);
        root.getChildren().add(message);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }



}
