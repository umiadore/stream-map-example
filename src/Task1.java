import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//есть список из книг, у каждой книги есть запись о том, кто ее взял
// нужно вывести список людей, которые взяли книги, при этом их имена должны начинаться на букву А
public class Task1 {
    public static void main(String[] args) {
        Person daniil = new Person("Daniil");
        Person arthur = new Person("Arthur");
        Person vlad = new Person("Vlad");
        Person alex = new Person("Alex");
        Person anton = new Person("Anton");

        Book book1 = new Book("Anna Karenina", daniil);
        Book book2 = new Book("Pride and Prejudice", arthur);
        Book book3 = new Book("Fathers and children", vlad);
        Book book4 = new Book("Onegin", anton);
        Book book5 = new Book("War and Peace", alex);
        Book book6 = new Book("Twilight", null);

        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);


        List <String> bookNames = books.stream()
                .map(book -> book.getName())
                .toList();
        System.out.println(bookNames);

        List <String> names = books.stream()
                .map(Book::getBorrowedBy)
                .filter(Objects::nonNull) // (изначально выглядело так: person -> person !=null), :: - это ссылка на метод (то же самое что и ->)
                .map(Person::getName)
                .filter(Objects::nonNull) // name -> name != null
                .filter(name -> name.startsWith("A"))
                .toList();

        System.out.println(names);
    }
}
