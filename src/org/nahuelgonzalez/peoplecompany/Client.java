package org.nahuelgonzalez.peoplecompany;

public class Client extends People{

    private int clientID;
    private static int lastId;

    public Client() {
    }

    public Client(String name, String lastName, String taxNumber, String address) {
        super(name, lastName, taxNumber, address);
        this.clientID =++lastId;
    }

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n Client ID=" + clientID;
    }
}
