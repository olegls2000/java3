package service;

import model.Car;

public class Warehouse {
    private static final double PROFIT_RATE = 1.15d;
    private Car[] cars = new Car[5];
    private long balance;


    public Warehouse(long balance) {
        this.balance = balance;
    }

    public Car buyCar(Car car) {
        Car calClone = new Car(car.getPrice(),
                car.getWeight(),
                car.getColor(),
                car.getManufacturer());

        if (calClone.getPrice() > balance) {
            System.out.println("Not enough money :(");
            return car;
        }

        int freePlace = -1;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] == null) {
                freePlace = i;
                break;
            }
        }
        if (freePlace == -1) {
            System.out.println("No free places :(");
            return car;
        }
        cars[freePlace] = calClone;
        balance -= calClone.getPrice();

        return null;
    }

    public Car sellCar() {
        //TODO ...
        return null;
    }

    public void printReport() {
        System.out.println("Warehouse balance: " + this.balance +
                ". Car count: " + getCarsCount());
    }

    private int getCarsCount() {
        int count = 0;
        for (Car car : cars) {
            if (car != null) {
                count++;
            }
        }
        return count;
    }
}
