package service;

import model.Employee;

public class Company {
    private Employee[] employees;

    public Company(Employee[] employees) {
        this.employees = employees;
    }

    public Employee getWithMaxSalary() {
        Employee result = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() > result.getSalary()) {
                result = employee;
            }
        }
        return result;
    }

    public Employee getOldest() {
        Employee result = employees[0];
        for (Employee employee : employees) {
            if (employee.getAge() > result.getAge()) {
                result = employee;
            }
        }
        return result;
    }

    public void salaryReview() {
        //TODO...
    }
}
