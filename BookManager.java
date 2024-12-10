
import java.util.ArrayList;

public interface BookManager {
    void addBook(Book book);
    void removeBook( String Title );
    void getBookList();
    ArrayList<Book> getBook( String keyword );

}
