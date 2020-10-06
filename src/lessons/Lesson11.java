package lessons;

import model.*;
import pattern.Container;
import pattern.ContainerImpl;
import pattern.Iterator;


public class Lesson11 {
    public static void main(String[] args) {
        Container<Car> container = new ContainerImpl(
                new Car(), new Car(), new Car(), new Car(),
                new Car(), new Car(), new Car(), new Car());


        Iterator<Car> iterator = container.getIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next().getWeight() + " ");

        }

        iterator = container.getIterator();
        iterator.next().getColor();
        final Car next = iterator.next();
        iterator.remove();

        System.out.println();

        iterator = container.getIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");

        }

        Container<Shape> containerShapes = new ContainerImpl(new Circle(4));
        Shape sh = containerShapes.getIterator().next();


        int i = MyInterface.t;

        MyInterface implObj = new MyInterfaceImpl();
        implObj.myMethod();
        MyInterface implObj1 = new MyInterfaceImpl();
        implObj1.myMethod();

        MyInterface intfObj = new MyInterface() {
            @Override
            public void myMethod() {
                System.out.println("Hello from MyInterface");
            }
        };
        System.out.println("Anon class name: "+ intfObj.getClass().getName());

        intfObj.myMethod();
        MyInterface intfObj2 = new MyInterface() {
            @Override
            public void myMethod() {
                System.out.println("Hello from MyInterface@@@");
            }

            @Override
            public int myDefaultMethod() {
                return 0;
            }
        };

        intfObj2.myMethod();
        System.out.println("Anon class name: "+ intfObj2.getClass().getName());

    }
}
