
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int container1 = 0;
        int container2 = 0;

        while (true) {
            System.out.println("First: " + container1 + "/100");
            System.out.println("Second: " + container2 + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            if (input.contains("add") && Integer.valueOf(parts[1]) > 0) {
                container1 += Integer.valueOf(parts[1]);
                if (container1 > 100) {
                    container1 = 100;
                }
            } else if (parts[0].equals("move")) {
                if (Integer.valueOf(parts[1]) > container1) {
                    container2 += container1;
                    container1 = 0;
                } else {
                    container1 -= Integer.valueOf(parts[1]);
                    container2 += Integer.valueOf(parts[1]);
                }
                if (container2 > 100) {
                    container2 = 100;
                }
            } else if (parts[0].equals("remove")) {
                if (Integer.valueOf(parts[1]) > container2) {
                    container2 = 0;
                } else {
                    container2 -= Integer.valueOf(parts[1]);
                }
            }
        }
    }

}
