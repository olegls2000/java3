package lessons;

import model.Car;
import model.Circle;
import model.AbstractFigure;
import model.SimpleTriangle;
import model.Square;
import service.Warehouse;

public class Lesson7 {
    public static void main(String[] args) {

        long myBalance = 3_000_000;
        Warehouse warehouse = new Warehouse(myBalance);

        Car carX = new Car();
        carX = warehouse.buyCar(carX);
        /* warehouse.printReport();
        warehouse.sellCar();
        warehouse.printReport();*/
        //carX.setPrice(60000);
        warehouse.printReport();

        AbstractFigure circle1 = new Circle(5);
        AbstractFigure circle2 = new Circle(4);
        AbstractFigure circle3 = new Circle(4);

        AbstractFigure square1 = new Square(4);
        AbstractFigure square2 = new Square(6);
        Square square3 = new Square(5);

        AbstractFigure[] abstractFigures = {circle1, square1, circle3, circle2, square2, square3};

        AbstractFigure AbstractFigureMaxPerim = abstractFigures[0];
        for (AbstractFigure AbstractFigure : abstractFigures) {
            if (AbstractFigure.getPerimetr() > AbstractFigureMaxPerim.getPerimetr()) {
                AbstractFigureMaxPerim = AbstractFigure;
            }
        }
        System.out.println(AbstractFigureMaxPerim);
        if (AbstractFigureMaxPerim instanceof Circle) {
            System.out.println("Circle");
        } else if (AbstractFigureMaxPerim instanceof SimpleTriangle) {
            System.out.println("SimpleTriangle");
        } else if (AbstractFigureMaxPerim instanceof Square) {
            System.out.println("Square");
        }

        AbstractFigure figureMinSquare = abstractFigures[0];
        for (AbstractFigure figure : abstractFigures) {
            if (figureMinSquare.getSquare() > figure.getSquare()) {
                figureMinSquare = figure;
            }
        }
        System.out.println(figureMinSquare);
        if (figureMinSquare instanceof Circle) {
            System.out.println("Circle");
        } else if (figureMinSquare instanceof SimpleTriangle) {
            System.out.println("SimpleTriangle");
        } else if (figureMinSquare instanceof Square) {
            System.out.println("Square");
        }
    }
}
