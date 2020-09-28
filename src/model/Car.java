package model;

import static utils.RandomUtils.getRandomFromRange;

public class Car {
    public static final int MIN_PRICE = 80_000;
    public static final int MAX_PRICE = 400_000;
    public static final int MIN_WEIGHT = 1200;
    public static final int MAX_WEIGHT = 2500;

    private int price;
    private int weight;
    private Color color;
    private Manufacturer manufacturer;

    public Car() {
         this(
                getRandomFromRange(MIN_PRICE, MAX_PRICE),
                getRandomFromRange(MIN_WEIGHT, MAX_WEIGHT),
                Color.values()[getRandomFromRange(0, Color.values().length - 1)],
                Manufacturer.values()[getRandomFromRange(0, Manufacturer.values().length - 1)]
        );
    }

    public Car(int price, int weight, Color color, Manufacturer manufacturer) {
        checkPrice(price);
        checkWeight(weight);
        this.price = price;
        this.weight = weight;
        this.color = color;
        this.manufacturer = manufacturer;
    }

    public Car(Car car){
        this.price = car.getPrice();
        this.weight = car.getWeight();
        this.color = color;
        this.manufacturer = manufacturer;
    }


    private void checkPrice(int price) {
        if (price > MAX_PRICE && price < MIN_PRICE) {
            throw new RuntimeException("Price is invalid!");
        }
    }

    private void checkWeight(int weight) {
        if (weight < MIN_WEIGHT && weight > MAX_WEIGHT) {
            throw new RuntimeException("Weight is invalid!");
        }
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        checkPrice(price);
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        checkWeight(weight);
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }
}
