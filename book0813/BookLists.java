package book;

public class BookLists {
    private Book[] books = new Book[10];
    private int size = 3;

    public BookLists() {
        this.books[0] = new Book("三国演义","罗贯中",12,"名著");
        this.books[1] = new Book("水浒传","施耐庵",12,"名著");
        this.books[2] = new Book("西游记","吴承恩",12,"名著");
    }

    public Book getBook(int pos) {
        return this.books[pos];
    }

    public void setBook(Book book,int pos) {
        this.books[pos] = book ;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Book[] getBooks() {
        return this.books;
    }

}
