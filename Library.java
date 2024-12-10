
import java.util.List;
import java.util.ArrayList;
public class Library implements BookManager {
    protected String LibID ;
    protected String LibName ;
    protected List<Book> BooksInLib ;
    public Library( String LibID, String LibName, List<Book> BooksInLib ) {
        this.LibID = LibID;
        this.LibName = LibName;
        this.BooksInLib = new ArrayList<>();
    }
    public Library( String LibID , String LibName ) {
        this.LibID = LibID;
        this.LibName = LibName;
    }
    public String getLibID() {
        return LibID;
    }
    public String getLibName() {
        return LibName;
    }
    public List<Book> getBooksInLib() {
        return BooksInLib;
    }
    public void setLibID(String LibID) {
        this.LibID = LibID;

    }
    public void setLibName(String LibName) {
        this.LibName = LibName;
    }
    public void setBooksInLib(ArrayList<Book> BooksInLib) {
        this.BooksInLib = BooksInLib;
    }
    @Override
    public void addBook( Book book ) {
        BooksInLib.add(book);
        System.out.println( book.getTitle() + " has been added to the library "  );
    }
    public void removeBook(String ID) {
        BooksInLib.removeIf(sach -> sach.getID().equals(ID));
        System.out.println( " Book with ID : " + ID + " has been removed from the library "  );

    }
    @Override
    public ArrayList<Book> getBook( String key ) {
        ArrayList<Book> books = new ArrayList<>();
        for ( Book book : BooksInLib ) {
            if ( book.getTitle().toLowerCase().contains( key.toLowerCase() ) || book.getAuthor().toLowerCase().contains( key.toLowerCase() ) ) {
                books.add(book);
            }
        }
        return books;

    }
    @Override
    public void getBookList() {
        if ( BooksInLib.isEmpty() ) {
            System.out.println( "No Books in Library " );
        }
        else {
            System.out.println(" Book list available : ");
            for (Book book : BooksInLib) {
                System.out.println(book);
            }
        }
    }
    public int countBookInLib(){
        return BooksInLib.size();
    }
    public String toString() {
        return " LIBRARY( " + LibID + "," + LibName + ")\n" + " Number of Books in Library : " + countBookInLib() + "\n" +  "Book list : " + BooksInLib.toString() + "\n";

    }

}
