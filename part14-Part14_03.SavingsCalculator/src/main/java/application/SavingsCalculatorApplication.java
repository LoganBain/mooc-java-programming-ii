package application;

import javafx.application.Application;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SavingsCalculatorApplication extends Application {

    public static void main(String[] args) {
        launch(SavingsCalculatorApplication.class);
    }
    
    public void start(Stage stage) {
        BorderPane layout = new BorderPane();
        
        VBox controls = new VBox();
        BorderPane upperControl = new BorderPane();
        BorderPane lowerControl = new BorderPane();
        
        NumberAxis xAxis = new NumberAxis(0, 30, 1);
        NumberAxis yAxis = new NumberAxis(0, 27500, 2500);
        
        LineChart<Number, Number> chart = new LineChart<>(xAxis, yAxis);
        
        Label upperLabel = new Label("Monthly savings");
        Slider upperSlider = new Slider(25, 250, 25);
        Label upperNumber = new Label("0.0");
        Label lowerLabel = new Label("Yearly interest rate");
        
        
        upperControl.getChildren().add();
        controls.getChildren().addAll(upperControl, lowerControl);
    }

}
