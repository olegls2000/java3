package lessons;

import static utils.HumanUtils.CONST_NAME;
import static utils.HumanUtils.anotherMthd;
import static utils.HumanUtils.weddingTwoHumans;

import model.Animal;
import model.Human;
import model.Men;
import model.SimpleTriangle;

public class Lesson5 {
    public int duration;
    public static String topic;

    public static final double PI = 3.14;

    public static void main(String[] args) {
        final int a = 1;
        final Men men = new Men("Ivan", "Director");
        men.someMthd();
        Men.someMthdStat();
        Men menX = new Men("TTT", "TTT");
        men.setName( "Vasilij");

        //men = menX;
        System.out.println(men.getName());
        System.out.println(PI);
        System.out.println(Men.NUMBER);
        System.out.println(menX.getName());

        Lesson5 less5 = new Lesson5();
        less5.getRandomFromRange(2, 7);
        System.out.println(less5.duration);
        System.out.println(less5.topic);
        topic = "YY";


        Animal cat = new Animal("canine");
        Animal cat1 = new Animal("canine");
        cat.getOneYearOlder();
        cat.getOneYearOlder();
        cat.getOneYearOlder();
        cat1.getOneYearOlder();
        System.out.println(cat.getAge());

        Human ivan = new Human("Ivan", "Ivanov", Human.MEN);
        Human maria = new Human("Maria", "Mironova", Human.WOMEN);
        Human dima = new Human("Dima", "Petrov", Human.MEN);
        ivan.wedding(maria);
        maria.wedding(dima);

        weddingTwoHumans(ivan, maria);
        anotherMthd();
        System.out.println(CONST_NAME);

        System.out.println(ivan.getLastName());
        System.out.println(maria.getLastName());

        SimpleTriangle tr1 = new SimpleTriangle(2, 2, 1);
        SimpleTriangle tr2 = new SimpleTriangle(6, 2, 5);
        SimpleTriangle[] simpleTriangles = {tr1, tr2};
    }

    static SimpleTriangle getTriangleWithMaxPerimetr(SimpleTriangle[] simpleTriangles) {
        SimpleTriangle max = simpleTriangles[0];
        for (SimpleTriangle tr : simpleTriangles) {
            if (tr.getPerimetr() > max.getPerimetr()) {
                max = tr;
            }
        }
        return max;
    }

    public int getRandomFromRange(int from, int to) {
        return (int) (Math.random() * (to - from) + from);
    }
}
