
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sumOfNumbers = 0;
        int amtOfNumbers = 0;
        
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input == 0) {
                break;
            }

            if (input > 0) {
                sumOfNumbers += input;
                amtOfNumbers++;
                continue;
            }
        } 
        if (sumOfNumbers < 1) {
            System.out.println("Cannot calculate average");
        } else {
            double average = 1.0 * sumOfNumbers / amtOfNumbers;
            System.out.println(average);
        }
    }
}
