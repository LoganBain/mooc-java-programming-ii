
public class Main {

    public static void main(String[] args) {
        // You can test your program here
        Box box = new OneItemBox();
        box.add(new Item("a", 1));
        box.add(new Item("b", 2));
        box.add(new Item("c", 2));
        System.out.println(box.isInBox(new Item("a")));
    }
}
