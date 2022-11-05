package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
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
        // Main layout
        BorderPane layout = new BorderPane();
        layout.setPrefSize(500, 400);

        // Savings control layout
        BorderPane savingsPane = new BorderPane();

        Slider savingsSlider = new Slider(25, 250, 25);
        savingsSlider.setShowTickMarks(true);
        savingsSlider.setShowTickLabels(true);
        savingsSlider.setMajorTickUnit(25);
        savingsSlider.setMinorTickCount(3);
        savingsSlider.setSnapToTicks(true);

        Label savingsValue = new Label("" + savingsSlider.getValue());

        savingsPane.setLeft(new Label("Monthly savings"));
        savingsPane.setCenter(savingsSlider);
        savingsPane.setRight(savingsValue);
        savingsPane.setPadding(new Insets(10));

        // Interest control layout
        BorderPane interestPane = new BorderPane();

        Slider interestSlider = new Slider(0, 10, 0);
        interestSlider.setShowTickMarks(true);
        interestSlider.setShowTickLabels(true);
        interestSlider.setMinorTickCount(4);

        Label interestValue = new Label("" + interestSlider.getValue());

        interestPane.setLeft(new Label("Yearly interest rate"));
        interestPane.setCenter(interestSlider);
        interestPane.setRight(interestValue);
        interestPane.setPadding(new Insets(10));

        // Overall control layout
        VBox controls = new VBox();
        controls.getChildren().addAll(savingsPane, interestPane);

        // Chart creation
        NumberAxis xAxis = new NumberAxis(0, 30, 1);
        NumberAxis yAxis = new NumberAxis();

        LineChart<Number, Number> chart = new LineChart<>(xAxis, yAxis);
        chart.setTitle("Savings calculator");

        XYChart.Series savingsSeries = new XYChart.Series();
        XYChart.Series savingsWithInterestSeries = new XYChart.Series();

        chart.getData().addAll(savingsSeries, savingsWithInterestSeries);

        // Setting up layout
        layout.setTop(controls);
        layout.setCenter(chart);
        layout.setPadding(new Insets(10, 10, 10, 10));

        // Functionality
        savingsSlider.valueProperty().addListener((observable, oldValue, newValue) -> {
            savingsValue.setText("" + newValue.intValue());

            updateSavings(savingsSlider.getValue(), interestSlider.getValue(), savingsSeries, savingsWithInterestSeries);
        });
        interestSlider.valueProperty().addListener((observable, oldValue, newValue) -> {
            interestValue.setText("" + newValue.intValue());

            updateSavings(savingsSlider.getValue(), interestSlider.getValue(), savingsSeries, savingsWithInterestSeries);
        });

        Scene view = new Scene(layout);
        stage.setScene(view);
        stage.show();
    }

    private void updateSavings(double savings, double interestRate, XYChart.Series savingsSeries, XYChart.Series savingsWithInterestSeries) {
        savingsSeries.getData().clear();
        savingsWithInterestSeries.getData().clear();

        savingsSeries.getData().add(new XYChart.Data(0, 0));
        savingsWithInterestSeries.getData().add(new XYChart.Data(0, 0));

        double savs = 0.0;
        double intrs = 0.0;

        for (int i = 1; i <= 30; i++) {            
            savs += savings * 12;
            intrs = (intrs + savings * 12) * (1.0 + interestRate / 100.0);
            
            savingsSeries.getData().add(new XYChart.Data(i, savs));
            savingsWithInterestSeries.getData().add(new XYChart.Data(i, intrs));
        }
    }
}
