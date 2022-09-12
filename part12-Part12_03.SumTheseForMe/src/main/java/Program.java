
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // test your method here

        int[] numbers = {3, -1, 8, 4};

        System.out.println(sum(numbers, 0, 0, 0, 0));
        System.out.println(sum(numbers, 0, 0, 0, 10));
        System.out.println(sum(numbers, 0, 1, 0, 10));
        System.out.println(sum(numbers, 0, 1, -10, 10));
        System.out.println(sum(numbers, -1, 999, -10, 10));

    }

    public static int sum(int[] array, int fromWhere, int toWhere, int smallest, int largest) {

        int sum = 0;

        if (fromWhere < 0) {
            fromWhere = 0;
        }

        if (toWhere > array.length) {
            toWhere = array.length;
        }

        for (int i = fromWhere; i < toWhere; i++) {
            if (array[i] <= largest && array[i] >= smallest) {
                sum += array[i];
            }
        }

        return sum;
    }

}
