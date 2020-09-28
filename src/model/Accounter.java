package model;

import java.util.Objects;

public class Accounter extends Employee {

    private String departmentName;

    public Accounter(String firstName, String lastName, int age, long salary, String departmentName) {
        super(firstName, lastName, age, salary);
        this.departmentName = departmentName;
    }

    public Accounter(String firstName, String lastName, String departmentName) {
        super(firstName, lastName);
        this.departmentName = departmentName;
    }


    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public void salaryReview() {

    }

    @Override
    public String toString() {
        return "Accounter{" +
                "departmentName='" + departmentName + '\'' +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Accounter accounter = (Accounter) o;
        return departmentName.equals(accounter.departmentName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), departmentName);
    }
}
