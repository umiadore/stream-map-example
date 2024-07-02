import java.util.Objects;

public class Book {

    private String name;
    private Person borrowedBy;

    public Book(String name, Person borrowedBy) {
        this.name = name;
        this.borrowedBy = borrowedBy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getBorrowedBy() {
        return borrowedBy;
    }

    public void setBorrowedBy(Person borrowedBy) {
        this.borrowedBy = borrowedBy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return Objects.equals(name, book.name) && Objects.equals(borrowedBy, book.borrowedBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, borrowedBy);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", borrowedBy=" + borrowedBy +
                '}';
    }
}
