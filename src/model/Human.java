package model;

public class Human {
    public static final boolean MEN = false;
    public static final boolean WOMEN = true;

    private String firstName;
    private String lastName;
    private boolean sex;

    public Human(String firstName, String lastName, boolean sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
    }

    public void wedding(Human anotherHuman) {
        if (this.sex == MEN) {
            anotherHuman.lastName = this.lastName;
        }
        if (this.sex == WOMEN) {
            this.lastName = anotherHuman.lastName;
        }
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
