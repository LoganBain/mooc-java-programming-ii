
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReadingFilesPerLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test the method here

    }

    public static List<String> read(String file) {
        ArrayList<String> rows = new ArrayList<>();
        
        try {
            Files.lines(Paths.get(file)).forEach(r -> rows.add(r));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return rows;
    }
}
