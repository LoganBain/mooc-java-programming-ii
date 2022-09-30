package notifier;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class NotifierApplication extends Application {

    public void start(Stage window) {
        TextField inputBox = new TextField("");
        Button button = new Button("Update");
        Label outputBox = new Label();
        
        button.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                outputBox.setText(inputBox.getText());
            }
        });
        
        VBox layout = new VBox();
        layout.getChildren().addAll(inputBox, button, outputBox);
        
        
        Scene view = new Scene(layout);   
        
        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }

}
