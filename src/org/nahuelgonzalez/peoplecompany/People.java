package org.nahuelgonzalez.peoplecompany;

public class People {

    private String name;
    private String lastName;
    private String taxNumber;
    private String address;

    public People() {
    }

    public People(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public People(String name, String lastName, String taxNumber) {
        this(name, lastName);
        this.taxNumber = taxNumber;
    }

    public People(String name, String lastName, String taxNumber, String address) {
        this(name, lastName, taxNumber);
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "\n Name= " + this.getName() +
                "\n Last Name= " + this.getLastName() +
                "\n TaxNumber= " + this.getTaxNumber() +
                "\n Addres= " + this.getAddress();
    }
}
