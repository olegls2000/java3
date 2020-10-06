package service;

import model.Shape;

import java.util.ArrayList;

public interface Reporter<T> {
    void printReport(ArrayList<T> figures);
    void myCalculation (T obj1, T obj2);
}
