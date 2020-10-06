package model;

import java.io.IOException;

import lessons.exception.MyException;

public final class Subclass extends AbstractParent {
    public int publicInt = 99;


    public void myMeth() {
        System.out.println(this.publicInt);
        System.out.println(super.publicInt);
        System.out.println(protectedInt);
        System.out.println(defInt);
        //System.out.println( privateInt);
    }

    @Override
    public void publicMthd() {
        System.out.println("Hello from Sub!!!");
        super.publicMthd();

    }

    @Override
    public void protectedMthd() {
        System.out.println("Hello from Sub!!!");
    }

    @Override
    void defaultMthd() {
        System.out.println("Hello from Sub!!!");
    }

    public void privateMthd() {
        System.out.println("Hello from Sub!!!");
    }

    //Return Type Covariants:
    @Override
    public Integer returnInteger() {
        return null;
    }

    @Override
    void abstractMethod() {
        System.out.println("Hello from Sub");
    }

/*    @Override
    void exceptionExample() throws Throwable {
        throw new Throwable("");
    }*/

    @Override
    void exceptionExample() throws Exception {
        throw new Exception("");
    }
}
