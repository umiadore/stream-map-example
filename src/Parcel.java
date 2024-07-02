import java.util.Objects;

public class Parcel {
    private  double weight;

    public Parcel(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Parcel parcel)) return false;
        return Double.compare(weight, parcel.weight) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight);
    }

    @Override
    public String toString() {
        return "Parcel{" +
                "weight=" + weight +
                '}';
    }
}
