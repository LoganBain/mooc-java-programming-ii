
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author logan
 */
public class UserInterface {
    private TodoList list;
    private Scanner scanner;
    
    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }
    
    public void start() {
        while (true) {
            System.out.println("Command:");
            String cmd = scanner.nextLine();
            
            if (cmd.equals("stop")) {
                return;
            }
            
            if (cmd.equals("add")) {
                System.out.println("To add:");
                this.list.add(scanner.nextLine());
            } else if (cmd.equals("list")) {
                this.list.print();
            } else if (cmd.equals("remove")) {
                System.out.println("Which one is removed?");
                int toRemove = Integer.valueOf(scanner.nextLine());
                this.list.remove(toRemove);
            }
        }
    }
}
