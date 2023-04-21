package org.nahuelgonzalez.main;

import org.nahuelgonzalez.peoplecompany.Employee;
import org.nahuelgonzalez.peoplecompany.Manager;

public class PeopleCompanyMain {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Oliver", "Smith", "202020das", "Right Now Courier 320", 2.50);
        Employee employee2 = new Employee("Jacob", "Walsh", "12304lsd", "Shoemaker ave 123", 5.6);
        Employee employee3 = new Employee("Reece", "Williams", "312345jds", "Granville St 1244", 45.2);

        Manager manager = new Manager("Waldo", "Flores", "123434jjjasd", "Pack St 420", 34.565);
        manager.setBudget(300.5);


        System.out.println("====== INFO EMPLOYEE ======");
        System.out.println("\n=== INFO empleado1 === " + employee1);
        System.out.println("\n=== INFO empleado1 === " + employee2);
        System.out.println("\n=== INFO empleado3 === " + employee3);


        System.out.println("====== INFO MANAGER ======");
        System.out.println("\n=== INFO Manager === = " + manager);

        System.out.println("===== INCREASE PERCENTAGE TO EMPLOYEE =====");

        employee3.increaseRemuneration(20);

        System.out.println("\n=== INFO empleado3 === " + employee3);
    }
}
