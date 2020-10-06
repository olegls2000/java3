package service;

import model.Shape;

import java.util.ArrayList;

public class FigureReporter implements Reporter<Shape> {
    @Override
    public void printReport(ArrayList<Shape> figures) {
        for (Shape shape : figures) {
            System.out.println(shape.getPerimetrX());
        }
    }

    @Override
    public void myCalculation(Shape obj1, Shape obj2) {

    }
}
