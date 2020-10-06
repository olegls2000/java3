package lessons.lesson11hw;

import static utils.RandomUtils.getRandomFromRange;

public class Track extends Car {
    private static final int LOAD_RATE = 15;

    private int payload;

    public Track() {
        this(getRandomFromRange(200, 1500));
    }

    @Override
    public int getPrice() {
        return payload * LOAD_RATE + super.getCarPrice();
    }

    public Track(int payload) {
        super();
        this.payload = payload;
    }

    public int getPayload() {
        return payload;
    }

    public void setPayload(int payload) {
        this.payload = payload;
    }

    @Override
    public String toString() {
        return "Track{" +
                "payload=" + payload +
                "} " + super.toString();
    }
}
