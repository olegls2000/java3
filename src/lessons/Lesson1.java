package lessons;

public class Lesson1 {
    public static void main(String[] args) {
        short s = 100;
        short s1 = 100;
        int i = 3000;
        //i = s;
        s = (short) i;
        System.out.println("s=" + s);
        System.out.println("i=" + i);
        int i1 = 1000;
        double d = 2000.99995555;
        //i1 = (int)d;
        //i1 = (int)d;
        System.out.println("i1=" + i1);
        System.out.println("d=" + d);
        int i3 = 10;
        int i4 = 5;
        int result = i3 % i4;

        System.out.println("10 % 5 = " + result);
        System.out.println("__________________________");
        System.out.println("|                         |");
        System.out.println("|                         |");
        System.out.println("|                         |");
        System.out.println("__________________________");

        //Создайте программу, которая вычислит выражение 121 * ⅓ +388^3 и выведет результат на экран.
        double result1 = 121 * (1 / 3) + Math.pow(388, 3);
        System.out.println("121 * ⅓ +388^3 = " + result1);

        //Создайте программу выводящую на экран результаты следующих вычислений:
        // (int) (((double)7 / 3 )*10 ) % 31=?
        int result2 = (int) (((double) 7 / 3) * 10) % 31;
        System.out.println("(int) (((double)7 / 3 )*10 ) % 31 = " + result2);

        //***Создайте программу, которая вычислит выражение
        // 14/209+14ˣ(29-13²+14/3) и
        // выведет результат на экран.
        // При этом число 14 обязательно сохраните
        // в отдельной переменной, выбрав для неё подходящий тип.
        int t = 60;
        double result3 = t / 209 + t * (29 - 13 * 13 + t / 3);
        System.out.println(t + "/209+" + t + "ˣ(29-13²+" + t + "/3) = " + result3);

        int inc = 10;

        inc += 1; // > inc = inc + 1; 11
        inc++; // > inc = inc + 1;    12
        inc--; // > inc = inc - 1;    11
        inc *= 2; // > inc = inc * 2;  22
        inc /= 2; // > inc = inc / 2;  11
        inc--;                        //10

        System.out.println("inc = " + inc);
        //В переменных a и b хранятся два натуральных числа.
        // Создайте программу, выводящую на экран результат деления a на b
        // с остатком.
        // Пример вывода программы "17 / 8  = 2,  remaining 1";
        int a = 100;
        int b = 9;
        int div = a / b;
        int remDiv = a % b;
        System.out.println(a + " / " + b + " = " + div + "; remaining " + remDiv);
        boolean bool = true;
        boolean bool1 = 1 > 2; //false
        bool1 = 1 < 2;  //true
        bool1 = 1 >= 2;
        bool1 = 1 <= 2;
        bool1 = 1 == 2;
        bool1 = 1 != 2;
        if (bool1) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
        //Создать программу, проверяющую и сообщающую на экран,
        // является ли целое число записанное в переменную n,
        // чётным либо нечётным.

        int n = 16;
        boolean isOdd = n % 2 != 0;
        if (isOdd) {
            System.out.println("Number is ODD");
        } else {
            System.out.println("Number is EVEN");
        }

        int a1 = 5;
        int b1 = 5;
        int c1 = 5;

        if (a1 > b1) {
            if (a1 > c1) {
                System.out.println("Max = " + a1);
            } else {
                System.out.println("Max = " + c1);
            }
        } else {
            if (b1 > c1) {
                System.out.println("Max = " + b1);
            } else {
                System.out.println("Max = " + c1);
            }
        }


        //      - Создайте программу, которая вычислит выражение 69/100+18*(69-13^2+69/3.14) и выведет результат на экран.
        //      Замените число 69 переменной  b соответствующего типа и поэкспериментируйте с различными значениями.
        //      - Найти максимальное из  вещественных переменых a, b , c. вывести на экран результат.
        //      Подставить различные значения в переменные.
        //- Создайте программу, которая вычислит выражение 20ˣ⅓+158² и выведет результат на экран
        //       - В переменной n хранится двузначное число. Создайте программу, вычисляющую и выводящую на экран сумму цифр n.
    }
}
