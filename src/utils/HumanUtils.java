package utils;

import model.Human;

public class HumanUtils {

    public static final String CONST_NAME = "CONST_NAME";

    public static void anotherMthd() {

    }

    public static void weddingTwoHumans(Human human, Human anotherHuman) {
        if (human.isSex() == Human.MEN) {
            anotherHuman.setLastName(human.getLastName());
        }
        if (human.isSex() == Human.WOMEN) {
            human.setLastName(anotherHuman.getLastName());
        }
    }
}
