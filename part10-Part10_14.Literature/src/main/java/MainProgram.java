
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        
        while (true) {
            System.out.println("Input the name of the book, empty stops:");
            String title = scanner.nextLine();
            
            if (title.isEmpty()) {
                break;
            }
            
            System.out.println("Input the age recommendation:");
            int age = Integer.parseInt(scanner.nextLine());
            
            books.add(new Book(title, age));
        }
        
        Comparator<Book> comparator = Comparator
                .comparing(Book::getAge)
                .thenComparing(Book::getTitle);
        Collections.sort(books, comparator);
        
        System.out.println(books.size() + " books in total.");
        System.out.println("\nBooks:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

}
