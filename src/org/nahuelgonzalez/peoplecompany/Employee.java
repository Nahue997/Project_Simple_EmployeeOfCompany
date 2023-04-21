package org.nahuelgonzalez.peoplecompany;

public class Employee extends People{

    private Double remuneration;
    private int employeeId;
    private static int lastId;

    public Employee() {

    }

    public Employee(String name, String lastName, String taxNumber, String address, Double remuneration) {
        super(name, lastName, taxNumber, address);
        this.remuneration = remuneration;
        this.employeeId = ++lastId;
    }

    public Double getRemuneration() {
        return remuneration;
    }

    public void setRemuneration(Double remuneration) {
        this.remuneration = remuneration;
    }

    public void increaseRemuneration(int percentage){
        this.remuneration = remuneration+(((double) percentage /100)*remuneration);
    }



    @Override
    public String toString() {
        return  super.toString() +
                "\n Remuneration= " + remuneration +
                "\n employeeId=" + employeeId;
    }
}
