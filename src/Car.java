import java.util.Objects;

public class Car {

    private String make;

    private String model;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year &&
                Objects.equals(make, car.make) &&
                Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, model, year);
    }

    private int year;


}
