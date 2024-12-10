
public class Book {
    protected String ID;
    protected String Title;
    protected String Author ;
    protected String Tag ;
    protected int publicYear ;
    protected boolean State ;
    public Book(String ID, String Title, String Author, String Tag, int publicYear, boolean State) {
        this.ID = ID;
        this.Title = Title;
        this.Author = Author;
        this.Tag = Tag;
        this.publicYear = publicYear;
        this.State = State ;
    }
    public String getID() {
        return ID;
    }
    public void setID(String ID) {
        this.ID = ID;
    }
    public String getTitle() {
        return Title;
    }
    public void setTitle(String Title) {
        this.Title = Title;
    }
    public String getAuthor() {
        return Author;
    }
    public void setAuthor(String Author) {
        this.Author = Author;
    }
    public String getTag() {
        return Tag;
    }
    public void setTag(String Tag) {
        this.Tag = Tag;
    }
    public int getPublicYear() {
        return publicYear;
    }
    public void setPublicYear(int publicYear) {
        this.publicYear = publicYear;
    }
    public boolean getState() {
        return State;
    }
    public void setState(boolean State) {
        this.State = State;
    }
    public String toString() {
        return "Book [ID=" + ID + ", Title=" + Title + ", Author=" + Author + ", Tag=" + Tag + ", publicYear=" + publicYear + ", State=" + State + "]";
    }
}
