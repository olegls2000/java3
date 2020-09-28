package model;

import lessons.Lesson2;

public class Men {
    private int age;
    private String name;
    private String profession;
    private int salary;

    public Men() {
    }

    public void someMthd() {
        System.out.println(Men.NUMBER);

    }

    public static void someMthdStat() {
        int y;
        System.out.println(Men.NUMBER);
        //static final int NUMBER = 44;
    }

    public Men(int age,
               String name,
               String profession) {
        this.age = age;
        this.name = name;
        this.profession = profession;
    }

    public Men(String name, String profession) {
        this.age = Lesson2.getRandomFromRange(18, 65);
        this.salary = Lesson2.getRandomFromRange(30_000, 120_000);
        this.name = name;
        this.profession = profession;
    }

    public static int NUMBER = 44;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
