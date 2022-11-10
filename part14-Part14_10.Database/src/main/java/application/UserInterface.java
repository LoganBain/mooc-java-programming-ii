package application;

import java.sql.SQLException;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private TodoDao database;

    public UserInterface(Scanner scanner, TodoDao database) {
        this.scanner = scanner;
        this.database = database;
    }

    public void start() throws SQLException {
        while (true) {
            System.out.println("");
            System.out.println("Enter command:");
            System.out.println("1) list");
            System.out.println("2) add");
            System.out.println("3) mark as done");
            System.out.println("4) remove");
            System.out.println("x) quit");

            System.out.print("> ");
            String command = this.scanner.nextLine();
            if (command.equals("x")) {
                break;
            }

            // implement the functionality here
            switch (command) {
                case "1":
                    System.out.println("Listing the database contents");
                    for (Todo todo : this.database.list()) {
                        System.out.println(todo.toString());
                    }
                    break;
                case "2":
                    System.out.println("Adding a new todo");
                    System.out.println("Enter name");
                    String name = this.scanner.nextLine();
                    System.out.println("Enter description");
                    String desc = this.scanner.nextLine();
                    int id = this.database.list().size();
                    this.database.add(new Todo(id, name, desc, false));
                    break;
                case "3":
                    System.out.println("Which todo should be marked as done (give the id)?");
                    int idCompleted = Integer.valueOf(this.scanner.nextLine());
                    this.database.markAsDone(idCompleted);
                    break;
                case "4":
                    System.out.println("Which todo should be removed (give the id)?");
                    int idToRemove = Integer.valueOf(this.scanner.nextLine());
                    this.database.remove(idToRemove);
                    break;
            }
        }

        System.out.println("Thank you!");
    }

}
