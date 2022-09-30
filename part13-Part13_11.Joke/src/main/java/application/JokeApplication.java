package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JokeApplication extends Application {


    public static void main(String[] args) {
        launch(JokeApplication.class);
    }

    @Override
    public void start(Stage window) throws Exception {        
        Button joke = new Button("Joke");
        Button answer = new Button("Answer");
        Button explanation = new Button("Explanation");
        
        HBox buttons = new HBox();
        buttons.setSpacing(20);
        buttons.setAlignment(Pos.CENTER);
        buttons.getChildren().addAll(joke, answer, explanation);
        
        BorderPane bPane = new BorderPane();
        bPane.setPrefSize(300, 180);
        bPane.setPadding(new Insets(20, 20, 20, 20));
        bPane.setTop(buttons);
        
        // Subviews
        StackPane questionView = createView("What do you call a bear with no teeth?");
        StackPane answerView = createView("A gummy bear.");
        StackPane explanationView = createView("The bear would be 'gummy' as it has no teeth, only gums.");
        
        Scene mainView = new Scene(bPane);
        
        joke.setOnAction((event) -> bPane.setCenter(questionView));
        answer.setOnAction((event) -> bPane.setCenter(answerView));
        explanation.setOnAction((event) -> bPane.setCenter(explanationView));
        
        window.setScene(mainView);
        window.show();
    }
    
    private StackPane createView(String text) {
        StackPane view = new StackPane();
        
        view.setPrefSize(300, 180);
        view.setPadding(new Insets(20, 20, 20, 20));
        view.getChildren().add(new Label(text));
        view.setAlignment(Pos.CENTER);
        
        return view;
    }
}
