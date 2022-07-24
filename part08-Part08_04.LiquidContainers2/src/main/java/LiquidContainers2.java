
import java.util.Scanner;
 
public class LiquidContainers2 {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
 
        Container first = new Container();
        Container second = new Container();
 
        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);
            System.out.print("> ");
 
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
 
            String[] partsOfInput = input.split(" ");
            input = partsOfInput[0];
            int amount = Integer.valueOf(partsOfInput[1]);
 
            if (input.equals("add")) {
                first.add(amount);
            }
 
            if (input.equals("move")) {
                if (amount > first.contains()) {
                    amount = first.contains();
                }
 
                first.remove(amount);
                second.add(amount);
            }
 
            if (input.equals("remove")) {
                second.remove(amount);
            }
 
            System.out.println("");
        }
    }
}
