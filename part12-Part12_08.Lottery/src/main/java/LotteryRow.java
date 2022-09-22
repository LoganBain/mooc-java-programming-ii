
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        Random rndm = new Random();
        // Implement the random number generation here
        // the method containsNumber is probably useful
        int index = 0;
        while (index < 7) {
            int randomNumber = rndm.nextInt(40) + 1;
            if (this.numbers.contains(randomNumber)) {
                continue;
            }
            this.numbers.add(randomNumber);
            index++;
        }
    }

    public boolean containsNumber(int number) {
        // Check here whether the number is among the drawn numbers
        if (this.numbers.contains(number)) {
            return true;
        }
        return false;
    }
}

