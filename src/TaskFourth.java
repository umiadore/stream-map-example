import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//из списка книг создать мапу, в которой ключ - название книги, а значение - человек, который ее читает
public class TaskFourth {
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
        Book book6 = new Book("Twilight", daniil);

        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);

        Map<String, String> map = books.stream()
                .collect(Collectors.toMap(b -> b.getName(), b-> b.getBorrowedBy().getName())); // Collectors.toMap - собирает стрим в коллекцию типа map
        System.out.println(map);

       String res =  map.get("War and Peace");
        System.out.println(res);

    }
}
