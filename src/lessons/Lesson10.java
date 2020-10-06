package lessons;

import static lessons.Lesson9.replace;

import model.Circle;
import model.Shape;
import model.Triangle;
import model.WithPerimetr;
import model.WithSquare;
import pattern.Airplane;
import pattern.Avionica;
import pattern.Builder;
import pattern.CNN;
import pattern.Delfi;
import pattern.ERR;
import pattern.Engine;
import pattern.MeteoStation;
import pattern.Singleton;
import pattern.Wing;

public class Lesson10 {
    public static void main(String[] args) {
        printWordsCount(" Hello hello. How Are you? I have seen you ...");

        Shape triangle = new Triangle();
        // triangle.triangleMeth();
        triangle.getName();
        //triangle.getPerimetr();
        //triangle.getSquare();

        Shape[] shapes = {triangle};
        printMaxPerimetr(shapes);
        printMinSquare(shapes);
        Builder airplaneBuilder = new Builder();
        airplaneBuilder.setAvionica(new Avionica());
        System.out.println("Hello ...");
        airplaneBuilder.setEngine(new Engine());
        System.out.println("Do smt else ....");
        airplaneBuilder.setWings(new Wing[]{new Wing(), new Wing()});
        System.out.println("Other Logic ....");

        Airplane airbus = airplaneBuilder.build();

        Builder boeingBuilder = new Builder()
                .setAvionica(new Avionica())
                .setEngine(new Engine());
        System.out.println("Lalala");
        Airplane boeing = boeingBuilder.setWings(null).build();

        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();

        MeteoStation meteoStation = new MeteoStation();
        CNN cnn = new CNN();
        Delfi delfi = new Delfi();
        ERR err = new ERR();
        meteoStation.registerSubscriber(cnn);
        meteoStation.registerSubscriber(delfi);
        meteoStation.registerSubscriber(err);

        meteoStation.publishEvent("Temperature +20 C");
        meteoStation.publishEvent("Wind S-W 5 m/sec");
        meteoStation.publishEvent("Temperature +15 C");
        meteoStation.publishEvent("Wind N-W 9 m/sec");
        meteoStation.unsubscribe(cnn);
        meteoStation.unsubscribe(err);
        meteoStation.publishEvent("Temperature -1 C");
        meteoStation.publishEvent("Wind N-W 18 m/sec");





    }

    private static void printMinSquare(WithSquare[] array) {

    }

    private static void printMaxPerimetr(WithPerimetr[] array) {

    }

    private static void printWordsCount(String sentence) {
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            words[i] = replace(words[i], "?", "!", ".", ":", "\"", "\'", ";");
        }
        for (String word : words) {
            int count = 0;
            for (String wordX : words) {
                if (word.equalsIgnoreCase(wordX)) {
                    count++;
                }
            }
            System.out.println("Word " + word + " present " + count);
        }
    }
}
