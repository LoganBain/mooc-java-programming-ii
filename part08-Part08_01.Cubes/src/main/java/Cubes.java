
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String response = scanner.nextLine();

            if (response.equals("end")) {
                break;
            }
            
            int number = Integer.valueOf(response);
            System.out.println(number * number * number);
        }
    }
}
