package lessons;

import model.Accounter;
import model.Circle;
import model.Employee;
import model.Manager;
import model.Programmer;
import service.Company;

public class Lesson8 {
    public static void main(String[] args) {
        Employee programmer = new Programmer("Joe", "Do", new String[]{"Java"});
        Employee manager = new Manager("Chuk", "Norris", 50);
        Employee accounter = new Accounter("Kat", "Kat", "Marketing");

        Company bt = new Company(new Employee[]{programmer, manager, accounter});

        Employee oldest = bt.getOldest();
        Employee richest = bt.getWithMaxSalary();
        System.out.println("Oldest is: " + oldest);
        System.out.println("Richest is: " + richest);

        Employee accounter1 = new Accounter("Kat", "Kat", 30, 50_000, "Marketing");
        Employee accounter2 = new Accounter("Kat", "Kat", 30, 50_000, "Marketing");
        Employee accounter3 = accounter2;

        boolean resultRefComp = accounter1 == accounter2;
        System.out.println("Ref comp: " + resultRefComp);

        boolean resultRefComp23 = accounter2 == accounter3;
        System.out.println("Ref comp23: " + resultRefComp23);

        boolean resultEquals = accounter1.equals(accounter2);
        System.out.println("Eq comp: " + resultEquals);

        accounter1.equals(new Circle(8));
        System.gc();

    }
}
