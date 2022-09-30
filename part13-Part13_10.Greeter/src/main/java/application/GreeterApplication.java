package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GreeterApplication extends Application {


    public static void main(String[] args) {
        launch(GreeterApplication.class);
    }

    @Override
    public void start(Stage window) throws Exception {
        GridPane gPane = new GridPane();
        Label enterLabel = new Label("Enter your name and start.");
        TextField userInput = new TextField("");
        Button startButton = new Button("Start");
        
        gPane.add(enterLabel, 0, 0);
        gPane.add(userInput, 0, 1);
        gPane.add(startButton, 0, 2);
        
        gPane.setPrefSize(300, 180);
        gPane.setAlignment(Pos.CENTER);
        gPane.setVgap(10);
        gPane.setHgap(10);
        gPane.setPadding(new Insets(20, 20, 20, 20));  
        
        StackPane welcomePane = new StackPane();
        Label userLabel = new Label("Welcome " + null + "!");
        welcomePane.getChildren().add(userLabel);
        welcomePane.setPrefSize(300, 180);
        welcomePane.setPadding(new Insets(20, 20, 20, 20));
        
        Scene first = new Scene(gPane);
        Scene second = new Scene(welcomePane);
        
        startButton.setOnAction((event) -> {
            userLabel.setText("Welcome " + userInput.getText() + "!");
            window.setScene(second);
        });
        
        window.setScene(first);
        window.show();
    }
}
