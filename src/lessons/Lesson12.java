package lessons;

import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.sql.Connection;

import lessons.exception.MyException;
import lessons.exception.MyRuntimeException;
import lessons.lesson11hw.AutoSalon;
import lessons.lesson11hw.AutoSalonImpl;
import lessons.lesson11hw.Track;

public class Lesson12 {

    public static void main(String[] args) {
/*        AutoSalon autoSalon = new AutoSalonImpl(1000000);
        autoSalon.buyCar(new Track());
        System.out.println("Other stuff");*/
/*
        try {
            autoSalon.sellCar(9);

        } catch (Exception e) {
            System.out.println("Exception occurred:" + e.getMessage());
            throw new RuntimeException(e);
        }*/

        try {
            myExceptionThrow(2);
            System.out.println("Hello from Try");
        } catch (MyException e) {
            System.out.println(" I catch My Exception");
        } catch (Exception ex) {
            System.out.println("I catch Exception");
        } finally {
            System.out.println("Hello from Finally");
        }
        System.out.println("Other stuff 111");

        RandomAccessFile accessFile = null;
        try {
             accessFile = new RandomAccessFile("null", "null");
            accessFile.length();
            accessFile.read();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            if(accessFile != null) {
                try {
                    accessFile.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        try(RandomAccessFile accessFileX = new RandomAccessFile("null", "null");
            FileInputStream fis = new FileInputStream("c:/logo.txt")) {
            fis.read();
            accessFile.length();
            accessFile.read();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {

        }
    }

    private static void myExceptionThrow(int i) throws Exception {
        if (i % 2 == 0) {
            throw new Exception("Even is not allowed");
        }
    }

    private static int myExceptionThrowR() throws MyException {
        //return -1;
        throw new MyException("Hello from My Exception");
        //return -1;
    }

    private static void myRuntimeExceptionThrow() {
        throw new MyRuntimeException("Hello from My Runtime Exception");
    }

}
