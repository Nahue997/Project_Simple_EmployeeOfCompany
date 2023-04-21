package org.nahuelgonzalez.peoplecompany;

public class Manager extends Employee{

    private Double budget;

    public Manager(String name, String lastName, String taxNumber, String address, Double remuneration) {
        super(name, lastName, taxNumber, address, remuneration);
    }

    public void setBudget(Double budget) {
        this.budget = budget;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n Budget=" + budget;
    }
}
