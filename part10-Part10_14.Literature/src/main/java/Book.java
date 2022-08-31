/**
 *
 * @author logan
 */
public class Book {
    private String title;
    private int ageGroup;
    
    public Book(String bookTitle, int ageGroup) {
        this.title = bookTitle;
        this.ageGroup = ageGroup;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public int getAge() {
        return this.ageGroup;
    }
    
    @Override
    public String toString() {
        return (title + " (recommended for " + ageGroup + " year-olds or older)");
    }
}
