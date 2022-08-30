
public class Human implements Comparable {

    private int wage;
    private String name;

    public Human(String name, int wage) {
        this.name = name;
        this.wage = wage;
    }

    public String getName() {
        return name;
    }

    public int getWage() {
        return wage;
    }


    @Override
    public String toString() {
        return name + " " + wage;
    }

    @Override
    public int compareTo(Object obj) {
        Human compared = (Human) obj;
        int sum = this.wage - compared.getWage();
        if (sum == 0) {
            return 0;
        } else if (sum > 0) {
            return 1;
        } else {
            return -1;
        }
    }
}
