package lessons;

public class Lesson2 {
    public static void main(String[] args) {
        int t = 99;
        int k = 102;
        printClosest(t, k, 100);
        printClosest(t, k, 200);
        printClosest(4, 307, 300);

        long sum = getSum(500, 600);
        System.out.println("Sum = " + sum);

        printMax(5, 6, 8);
        printMax(7887785, 767645746, 84768);
        System.out.println(Long.MAX_VALUE);

        int max = getMax(66664, 457, 99);
        System.out.println("Max = " + max);

        int random = getRandomFromRange(5, 30);
        System.out.println("Random: " + random);

        random = getRandomFromRange(400, 40000);
        System.out.println("Random: " + random);

        int a1 = getRandomFromRange(5, 10);
        int b1 = getRandomFromRange(6, 12);
        int c1 = getRandomFromRange(3, 15);

        boolean isTriangle = isTrianglePossible(a1, b1, c1);
        System.out.println(" Possible - " + isTriangle);

        String result = printBoolean(false);
        System.out.println(result);
    }

    public static String printBoolean(boolean bool) {
        return bool ? "TRUE" : "FALSE";
    }

    public static boolean isTrianglePossible(int a, int b, int c) {
        if ((a + b > c) && (b + c > a) && (a + c > b)) {
            return true;
        }
        return false;
    }

    public static int getRandomFromRange(int from, int to) {
        return (int) (Math.random() * (to - from) + from);
    }

    public static void printMax(int a, int b, int c) {
        if (a > b) {
            if (a > c) {
                System.out.println("Max = " + a);
            } else {
                System.out.println("Max = " + c);
            }
        } else {
            if (b > c) {
                System.out.println("Max = " + b);
            } else {
                System.out.println("Max = " + c);
            }
        }
    }

    public static int getMax(int a, int b, int c) {
        if (a > b) {
            if (a > c) {
                return a;
            }
        } else {
            if (b > c) {
                return b;
            }
        }
        return c;
    }

    public static long getSum(int a, int b) {
        long result = a + b;
        return result;
    }

    public static void printClosest(int paramA, int paramB, int point) {
        int distA = point - paramA;
        int distB = point - paramB;
        distA = Math.abs(distA);
        distB = Math.abs(distB);
        if (distA > distB) {
            System.out.println(paramB + " is closer to " + point);
        } else {
            System.out.println(paramA + " is closer to " + point);
        }
    }
}
