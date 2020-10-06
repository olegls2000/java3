package service;

import model.Car;
import model.Shape;

import java.util.ArrayList;

public class CarReport implements Reporter<Car> {
    @Override
    public void printReport(ArrayList<Car> cars) {
        for (Car car: cars) {
            System.out.println(car.getManufacturer());
        }
    }

    @Override
    public void myCalculation(Car obj1, Car obj2) {

    }

}
