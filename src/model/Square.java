package model;

public class Square extends AbstractFigure {
    private int a;

    public Square(int a) {
        this.a = a;
    }

    @Override
    public int getPerimetr() {
        return 4 * a;
    }

    @Override
    public double getSquare() {
        return 0;
    }
}
