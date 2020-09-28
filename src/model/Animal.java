package model;

public class Animal {
    private String kind;
    private int age;

    public Animal(String kind) {
        this.kind = kind;
        this.age = 2;
    }

    public void getOneYearOlder() {
        this.age = this.age + 1;
    }

    public String getKind() {
        return this.kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

}
