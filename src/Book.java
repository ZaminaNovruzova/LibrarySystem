public class Book {
    private String title;
    private String author;
    private String id;
    private double price;
    private int quantity;

    public Book(String title, String author, String id, double price, int quantity) {
        this.title = title;
        this.author = author;
        this.id = id;
        this.price = price;
        this.quantity = quantity;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", id='" + id + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }



}
