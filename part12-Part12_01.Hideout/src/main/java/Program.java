
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you may try out your class here
        System.out.println("\n===TEST 1===");
        Hideout<String> den = new Hideout<>();
        System.out.println(den.isInHideout());
        den.putIntoHideout("peekaboo");
        System.out.println(den.isInHideout());
        System.out.println(den.takeFromHideout());
        System.out.println(den.isInHideout());
        den.putIntoHideout("toodaloo");
        den.putIntoHideout("heelloo");
        System.out.println(den.isInHideout());
        System.out.println(den.takeFromHideout());
        System.out.println(den.isInHideout());

        System.out.println("\n===TEST 2===");
        Hideout<Integer> den2 = new Hideout<>();
        System.out.println(den2.isInHideout());
        den2.putIntoHideout(1);
        System.out.println(den2.isInHideout());
        System.out.println(den2.isInHideout());
        System.out.println(den2.takeFromHideout());
        System.out.println(den2.isInHideout());
    }
}
