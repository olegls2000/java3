package model;

import static java.lang.Math.PI;

public class Circle extends AbstractFigure {
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
}
