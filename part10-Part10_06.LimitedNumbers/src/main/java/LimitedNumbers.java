
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            
            if (Integer.valueOf(input) < 0) {
                break;
            }
            
            numbers.add(Integer.valueOf(input));
        }
        
        numbers.stream().filter(n -> n > 0 && n < 6).forEach(n -> System.out.println(n));
    }
}
