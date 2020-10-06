package model;

import static java.lang.Math.PI;

public class Circle extends AbstractFigure implements Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public int getPerimetr() {
        return (int) (2 * PI * radius);
    }

    @Override
    public double getSquare() {
        return PI * radius * radius;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public double getPerimetrX() {
        return 0;
    }

    @Override
    public double getSquareX() {
        return 0;
    }
}
