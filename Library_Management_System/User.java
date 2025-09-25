import java.util.*;

public class User {
    private int id;
    private String name;
    private List<Book> borrowedBooks;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public int getId() { return id; }
    public String getName() { return name; }

    public void borrowBook(Book b) {
        borrowedBooks.add(b);
    }

    public void returnBook(Book b) {
        borrowedBooks.remove(b);
    }

    @Override
    public String toString() {
        return "User: " + id + " - " + name + " | Borrowed Books: " + borrowedBooks.size();
    }
}