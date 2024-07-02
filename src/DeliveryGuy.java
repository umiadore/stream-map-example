import java.util.List;
import java.util.Objects;

public class DeliveryGuy {
    private String name;
    private List <Parcel> deliveryList;
    private List <Parcel> notDeliveredList;

    public DeliveryGuy(String name, List<Parcel> deliveryList, List<Parcel> notDeliveredList) {
        this.name = name;
        this.deliveryList = deliveryList;
        this.notDeliveredList = notDeliveredList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Parcel> getDeliveryList() {
        return deliveryList;
    }

    public void setDeliveryList(List<Parcel> deliveryList) {
        this.deliveryList = deliveryList;
    }

    public List<Parcel> getNotDeliveredList() {
        return notDeliveredList;
    }

    public void setNotDeliveredList(List<Parcel> notDeliveredList) {
        this.notDeliveredList = notDeliveredList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DeliveryGuy that)) return false;
        return Objects.equals(name, that.name) && Objects.equals(deliveryList, that.deliveryList) && Objects.equals(notDeliveredList, that.notDeliveredList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, deliveryList, notDeliveredList);
    }

    @Override
    public String toString() {
        return "DeliveryGuy{" +
                "name='" + name + '\'' +
                ", deliveryList=" + deliveryList +
                ", notDeliveredList=" + notDeliveredList +
                '}';
    }
}
