package lessons;

import model.Point;
import model.Triangle;

public class Lesson6 {
    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        Point c = new Point(3, 0);
        Triangle triangle = new Triangle(a, b, c);
        System.out.println("Perimetr: " + triangle.gaetPerimetr());
    }
}
