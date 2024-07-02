import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

// узнать общий вес посылок у всех курьеров (выполненных и невыполенных)
public class TaskThird {
    public static void main(String[] args) {
        Parcel parcel1 = new Parcel(45.3);
        Parcel parcel2 = new Parcel(5.1);
        Parcel parcel3 = new Parcel(8.4);
        Parcel parcel4 = new Parcel(16.6);
        Parcel parcel5 = new Parcel(52.3);
        Parcel parcel6 = new Parcel(41.3);
        Parcel parcel7 = new Parcel(35.0);


        DeliveryGuy deliveryGuy1 = new DeliveryGuy("Daniil", List.of(parcel1,parcel2), List.of(parcel3));
        DeliveryGuy deliveryGuy2 = new DeliveryGuy("Ivan", List.of(parcel4), List.of(parcel5,parcel6,parcel7));

        List<DeliveryGuy> deliveryGuys = new ArrayList<>();
        deliveryGuys.add(deliveryGuy1);
        deliveryGuys.add(deliveryGuy2);

        Optional<Double> optional = deliveryGuys.stream()
                .filter(d-> d.getDeliveryList() != null)
                .flatMap(d -> Stream.concat(d.getDeliveryList().stream(), d.getNotDeliveredList().stream()))
                //.flatMap(d -> Stream.of(d.getDeliveryList(), d.getNotDeliveredList()))// мы получили стрим из листов посылок
               // .flatMap(d -> d.stream())
                .filter(parcel -> parcel !=null)
                .map(parcel -> parcel.getWeight())
                .reduce((x,y) -> x +y);

        Double result = optional.orElse(0.0);
        System.out.println(result);
    }
}
