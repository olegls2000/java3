package utils;

public class RandomUtils {
    private RandomUtils() {
        throw new RuntimeException();
    }

    public static int getRandomFromRange(int from, int to) {
        return (int) (Math.random() * (to - from) + from);
    }

}
