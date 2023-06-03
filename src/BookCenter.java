import java.util.ArrayList;
import java.util.List;

public class BookCenter {
    List<Book> books;

    public BookCenter() {
        this.books = new ArrayList<>();
    }

    public void add(Book book) {
        books.add(book);
    }

    public void update(String id, int quantity) throws BookNotFound {
        Book foundBook = null;
        for (Book book : books) {
            if (book.getId().equals(id)) {
                foundBook = book;
                break;
            }

        }
        if (foundBook == null) {
            throw new BookNotFound("Error");
        }
        foundBook.setQuantity(quantity);
    }

    public void remove(Book book) {
        books.remove(book);
    }

    public Book searchByTitle(String title) throws BookNotFound {
        Book foundBook = null;
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                foundBook = book;
                break;
            }
        }
        if (foundBook == null) {
            throw new BookNotFound("Error");

        }
        return foundBook;
    }

    public Book searchByAuthor(String author) throws BookNotFound {
        Book foundBook = null;
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                foundBook = book;
            }
        }
        if (foundBook == null) {
            throw new BookNotFound("Error");

        }
        return foundBook;
    }

    @Override
    public String toString() {
        return "BookCenter{" +
                "books=" + books +
                '}';
    }
}
