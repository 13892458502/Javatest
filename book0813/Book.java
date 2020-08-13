package book;

public class Book {
    private final String name;
    private final String author;
    private final int price;
    private final String type;
    private boolean ifBorrow = false;

    public Book(String name, String author, int price, String type) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", state=" + ifBorrow +
                '}';
    }

    public String getName() {
        return name;
    }

    public boolean isIfBorrow() {
        return ifBorrow;
    }

    public void setIfBorrow(boolean ifBorrow) {
        this.ifBorrow = ifBorrow;
    }
}