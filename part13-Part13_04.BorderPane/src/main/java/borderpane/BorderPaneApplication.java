package borderpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BorderPaneApplication extends Application {

    @Override
    public void start(Stage window) {
        BorderPane layout = new BorderPane();
        layout.setTop(new Label("NORTH"));
        layout.setRight(new Label("EAST"));
        layout.setBottom(new Label("SOUTH"));
        
        Scene scene = new Scene(layout);
        
        window.setScene(scene);
        window.show();
    }

    public static void main(String[] args) {
        launch(BorderPaneApplication.class);
    }
}
