package lessons.lesson11hw;

import static utils.RandomUtils.getRandomFromRange;

public class PassengerCar extends Car {
    private static final int PLACES_RATE = 150;

    private int places;

    @Override
    public String toString() {
        return "PassengerCar{" +
                "places=" + places +
                "} " + super.toString();
    }

    public PassengerCar() {
        this(getRandomFromRange(2, 8));
    }


    @Override
    public int getPrice() {
        return places * PLACES_RATE + super.getCarPrice();
    }

    public PassengerCar(int places) {
        super();
        this.places = places;
    }

    public int getPlaces() {
        return places;
    }

    public void setPlaces(int places) {
        this.places = places;
    }
}
