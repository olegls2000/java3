package lessons.lesson11hw;

import static utils.RandomUtils.getRandomFromRange;

import java.time.LocalDate;
import java.time.Month;

import model.Manufacturer;

public abstract class Car {

    private int state;
    private LocalDate year;

    @Override
    public String toString() {
        return "Car{" +
                "state=" + state +
                ", year=" + year +
                ", manufacturer=" + manufacturer +
                '}';
    }

    private Manufacturer manufacturer;
    protected static final int AGE_RATE = 8;
    protected static final int STATE_RATE = 100;


    public Car() {
        this(getRandomFromRange(1, 10),
                LocalDate.of(getRandomFromRange(1980, 2018), Month.JANUARY, 15),
                Manufacturer.values()[getRandomFromRange(0, Manufacturer.values().length - 1)]
        );
    }

    public Car(int state, LocalDate year, Manufacturer manufacturer) {
        this.state = state;
        this.year = year;
        this.manufacturer = manufacturer;
    }

    protected int getCarPrice() {
        return getAge() * AGE_RATE + getState() * STATE_RATE;
    }

    protected int getAge() {
        return LocalDate.now().getYear() - year.getYear();
    }

    public abstract int getPrice();

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public LocalDate getYear() {
        return year;
    }

    public void setYear(LocalDate year) {
        this.year = year;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }
}
