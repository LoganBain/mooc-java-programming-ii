package smiley;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class SmileyApplication extends Application {

    public static void main(String[] args) {
        launch(SmileyApplication.class);
    }

    public void start(Stage stage) {
        BorderPane layout = new BorderPane();
        Canvas canvas = new Canvas(300, 300);
        GraphicsContext drawer = canvas.getGraphicsContext2D();

        layout.setCenter(canvas);

        drawer.setFill(Color.BLACK);
        drawer.fillRect(70, 60, 25, 25);
        drawer.fillRect(200, 60, 25, 25);
        drawer.fillRect(75, 200, 150, 25); 
        drawer.fillRect(75, 175, 25, 25); 
        drawer.fillRect(200, 175, 25, 25);

        stage.setScene(new Scene(layout));
        stage.show();
    }

}
