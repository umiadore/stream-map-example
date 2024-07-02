import java.util.List;
import java.util.Objects;

public class Person {
    private String name;
    private List<Person> children;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, List<Person> children) {
        this.name = name;
        this.children = children;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Person> getChildren() {
        return children;
    }

    public void setChildren(List<Person> children) {
        this.children = children;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return Objects.equals(name, person.name) && Objects.equals(children, person.children);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, children);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", children=" + children +
                '}';
    }
}
