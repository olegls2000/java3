package model;

import java.util.Arrays;

public class Programmer extends Employee {
    private String[] languages;

    public Programmer(String firstName, String lastName, int age, long salary, String[] languages) {
        super(firstName, lastName, age, salary);
        this.languages = languages;
    }

    public Programmer(String firstName, String lastName, String[] languages) {
        super(firstName, lastName);
        this.languages = languages;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    @Override
    public void salaryReview() {

    }

    @Override
    public String toString() {
        return "Programmer{" +
                "languages=" + Arrays.toString(languages) +
                "} " + super.toString();
    }


}
