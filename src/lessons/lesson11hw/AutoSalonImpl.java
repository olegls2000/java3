package lessons.lesson11hw;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class AutoSalonImpl implements AutoSalon {
    private static final int PARKING_CAPACITY = 8;
    private static final double SALES_RATE = 1.2d;

    private List<Car> parking = new ArrayList<>();
    private long balance;

    public AutoSalonImpl(long balance) {
        this.balance = balance;
    }

    @Override
    public int buyCar(Car someCar) {
        if (this.parking.size() >= PARKING_CAPACITY) {
            throw new IllegalArgumentException("Not enough places");

        }
        final int carPrice = someCar.getPrice();
        if (this.balance < carPrice) {
            throw new IllegalArgumentException("Not enough balance");
        }
        this.parking.add(someCar);
        this.balance -= carPrice;

        return carPrice;
    }

    @Override
    public int sellCar(int i) throws Exception {
        if (i > PARKING_CAPACITY) {
            throw new Exception("No car o the parking slot" + i);
        }
        Car carForSale = this.parking.get(i);

        int salesPrice = (int) (carForSale.getPrice() * SALES_RATE);
        this.parking.remove(i);
        this.balance += salesPrice;

        return salesPrice;
    }

    @Override
    public void report() {
        System.out.println("-----------------------------------------------------");
        System.out.println("Report for Auto Salon  from " + LocalDateTime.now());
        System.out.println("Free Places: " + (PARKING_CAPACITY - this.parking.size()));
        System.out.println("Balance: " + this.balance + " Euros");
        for (Car car : this.parking) {
            System.out.println(car);
        }
    }
}
