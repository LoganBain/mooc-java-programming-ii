

public class Checker {
    public boolean isDayOfWeek(String string) {
        if (string.matches("mon|tue|wed|thu|fri")) {
            return true;
        }
        return false;
    }
    
    public boolean timeOfDay(String string) {
        if (string.matches("[0-2][0-3]:[0-5][0-9]:[0-5][0-9]")) {
            return true;
        }
        return false;
    }
}
