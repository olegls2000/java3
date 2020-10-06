package model;

public class MyInterfaceImpl implements MyInterface {
    @Override
    public void myMethod() {
        System.out.println("Hello from MyInterfaceImpl");
    }

    @Override
    public int myDefaultMethod() {
        System.out.println("Hello from MyInterfaceImpl");
        return 0;
    }
}
