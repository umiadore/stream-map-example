//есть список родителей, отдайте список детей

import java.util.ArrayList;
import java.util.List;

public class TaskSecond {
    public static void main(String[] args) {

        Person ivan = new Person ("Ivan");
        Person sergey = new Person ("Sergey");

        List <Person> arthursChildren = new ArrayList<>();
        arthursChildren.add(ivan);
        arthursChildren.add(sergey);
        Person arthur = new Person("Arthur", arthursChildren);

        Person karina = new Person ("Karina");
        List<Person> vladsChildren = new ArrayList<>();
        vladsChildren.add(karina);
        Person vlad = new Person("Vlad",vladsChildren);

        Person daniil = new Person ("Daniil");
        List<Person> alexsChildren  = new ArrayList<>();
        alexsChildren.add(daniil);
        Person alex = new Person("Alex", alexsChildren);

        Person anton = new Person("Anton");

        List<Person> people = new ArrayList<>();
        people.add(arthur);
        people.add(vlad);
        people.add(alex);
        people.add(anton);

        System.out.println(people);

        List <String> children = people.stream()
                .map(person -> person.getChildren())//взяли списки детей от каждого родителя
                .filter(childrenList -> childrenList != null)//удалили те списки, в которых никого нет
                .flatMap(childrenList -> childrenList.stream())
                .map(child ->child.getName()) //каждый список детей разложили на отдельных детей
                .toList();

        System.out.println(children);
    }
}
