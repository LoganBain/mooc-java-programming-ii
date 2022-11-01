package application;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.Chart;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class PartiesApplication extends Application {

    private HashMap<String, Map<Integer, Double>> values;

    public PartiesApplication() {
        values = readData("partiesdata.tsv");
    }

    public static void main(String[] args) {
        launch(PartiesApplication.class);
    }

    public void start(Stage stage) {
        NumberAxis xAxis = new NumberAxis(1968, 2008, 4);
        NumberAxis yAxis = new NumberAxis(0, 30, 5);

        LineChart<Number, Number> chart = new LineChart<>(xAxis, yAxis);
        chart.setTitle("Relative support of parties");

        values.keySet().stream().forEach(party -> {
            XYChart.Series data = new XYChart.Series();
            data.setName(party);
            values.get(party).entrySet().stream().forEach(pair -> {
                data.getData().add(new XYChart.Data(pair.getKey(), pair.getValue()));
            });
            System.out.println(data);
            chart.getData().add(data);
        });

        Scene view = new Scene(chart);
        stage.setScene(view);
        stage.show();
    }

    private HashMap<String, Map<Integer, Double>> readData(String textFile) {
        ArrayList<Integer> yearsList = new ArrayList<>();
        HashMap<String, Map<Integer, Double>> map = new HashMap<>();

        try ( Scanner reader = new Scanner(Paths.get(textFile))) {
            String[] firstRow = reader.nextLine().split("\t");
            for (int i = 1; i < firstRow.length; i++) {
                yearsList.add(Integer.valueOf(firstRow[i]));
            }

            while (reader.hasNextLine()) {
                String row = reader.nextLine();
                String[] parts = row.split("\t");

                String party = parts[0];
                HashMap<Integer, Double> supportData = new HashMap<>();
                for (int i = 1; i < parts.length; i++) {
                    if (!parts[i].equals("-")) {
                        int year = yearsList.get(i - 1);
                        double supportNum = Double.valueOf(parts[i]);
                        supportData.put(year, supportNum);
                    }
                }
                map.put(party, supportData);
            }
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return map;
    }
}
