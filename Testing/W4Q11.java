package Testing;

import java.util.ArrayList;
import java.util.List;

class LibraryService {
    private List<String> books = new ArrayList<>();

    public void addBook(String book) {
        books.add(book);
    }

    public boolean searchBook(String title) {
        return books.contains(title);
    }
}
public class W4Q11 {

}
