package model;

import static utils.RandomUtils.getRandomFromRange;

import java.time.Month;

public class Point {
    private int x;
    private int y;

    public Point() {
        this(getRandomFromRange(-10, 10), getRandomFromRange(-10, 10));
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
