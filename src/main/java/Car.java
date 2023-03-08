import java.util.Objects;

public class Car {

    private String color;
    private String marka;

    public Car(String color, String marka) {
        this.color = color;
        this.marka = marka;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return color.equals(car.color) &&
                marka.equals(car.marka);
    }

}
