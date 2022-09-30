//package application;
//
//import javafx.application.Application;
//import javafx.geometry.Insets;
//import javafx.geometry.Pos;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.control.Label;
//import javafx.scene.layout.BorderPane;
//import javafx.scene.layout.HBox;
//import javafx.scene.layout.StackPane;
//import javafx.stage.Stage;
//
//public class JokeApplication extends Application {
//
//
//    public static void main(String[] args) {
//        launch(JokeApplication.class);
//    }
//
//    @Override
//    public void start(Stage window) throws Exception {        
//        Button joke = new Button("Joke");
//        Button answer = new Button("Answer");
//        Button explanation = new Button("Explanation");
//        
//        HBox buttons = new HBox();
//        buttons.setSpacing(20);
//        buttons.setAlignment(Pos.CENTER);
//        buttons.getChildren().addAll(joke, answer, explanation);
//        
//        BorderPane bPane = new BorderPane();
//        bPane.setPrefSize(300, 180);
//        bPane.setPadding(new Insets(20, 20, 20, 20));
//        bPane.setTop(buttons);
//        
//        // Subviews
//        StackPane questionView = createView("What do you call a bear with no teeth?");
//        StackPane answerView = createView("A gummy bear.");
//        StackPane explanationView = createView("The bear would be 'gummy' as it has no teeth, only gums.");
//        
//        Scene mainView = new Scene(bPane);
//        
//        joke.setOnAction((event) -> bPane.setCenter(questionView));
//        answer.setOnAction((event) -> bPane.setCenter(answerView));
//        explanation.setOnAction((event) -> bPane.setCenter(explanationView));
//        
//        window.setScene(mainView);
//        window.show();
//    }
//    
//    private StackPane createView(String text) {
//        StackPane view = new StackPane();
//        
//        view.setPrefSize(300, 180);
//        view.getChildren().add(new Label(text));
//        view.setAlignment(Pos.CENTER);
//        
//        return view;
//    }
//}

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

    @Override
    public void start(Stage window) throws Exception {

        // 1. Create main layout
        BorderPane layout = new BorderPane();

        // 1.1. Create menu for main layout
        HBox menu = new HBox();
        menu.setPadding(new Insets(20, 20, 20, 20));
        menu.setSpacing(10);

        // 1.2. Create buttons for menu
        Button firstBtn = new Button("Joke");
        Button secondBtn = new Button("Answer");
        Button thirdBtn = new Button("Explanation");

        // 1.3. Add buttons to menu
        menu.getChildren().addAll(firstBtn, secondBtn, thirdBtn);

        layout.setTop(menu);


        // 2. Add subviews and add them to the menu buttons
        // 2.1. Create subview layout 
        StackPane firstLayout = createView("What do you call a bear with no teeth?");
        StackPane secondLayout = createView("A gummy bear.");
        
        StackPane thirdLayout = createView("Gummy bear is candy and candy is funny because candy");
        
        
        
        

        // 2.2. Add subviews to button. Pressing the buttons will change the view
        firstBtn.setOnAction((event) -> layout.setCenter(firstLayout));
        secondBtn.setOnAction((event) -> layout.setCenter(secondLayout));
        thirdBtn.setOnAction((event) -> layout.setCenter(thirdLayout));
        
        

        // 2.3. Set initial view
        layout.setCenter(firstLayout);


        // 3. Create main scene with layout 
        Scene scene = new Scene(layout);


        // 4. Show the main scene
        window.setScene(scene);
        window.show();
    }

    private StackPane createView(String text) {

        StackPane layout = new StackPane();
        layout.setPrefSize(300, 180);
        layout.getChildren().add(new Label(text));
        layout.setAlignment(Pos.CENTER);

        return layout;
    }

    public static void main(String[] args) {
        launch(JokeApplication.class);
    }
}
