
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        ArrayList<String> inputs = new ArrayList<>();

        System.out.println("Input numbers, type \"end\" to stop.");
        while (true) {
            String row = scanner.nextLine();
            
            if (row.equals("end")) {
                break;
            }
            
            inputs.add(row);
        }
        
        System.out.println("\nPrint the average of the negative numbers or the positive numbers? (n/p)");
        String response = scanner.nextLine();
        
        if (response.equals("n")) {
            double nAverage = inputs.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(s -> s < 0)
                    .average()
                    .getAsDouble();
            System.out.println("Average of the negative numbers: " + nAverage);
        } else if (response.equals("p")) {
            double pAverage = inputs.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(s -> s > 0)
                    .average()
                    .getAsDouble();
            System.out.println("Average of the positive numbers: " + pAverage);
        }
    }
}
