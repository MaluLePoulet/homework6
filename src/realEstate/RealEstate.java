package realEstate;

public class RealEstate {

    private static int nextId;

    private int id;

    private double squareMeters;

    private double costPerMonth;

    private Owner owner;

    private Client client;

    public double getSquareMeters() {
        return squareMeters;
    }

    public void setSquareMeters(double squareMeters) {
        this.squareMeters = squareMeters;
    }

    public double getCostPerMonth() {
        return costPerMonth;
    }

    public void setCostPerMonth(double costPerMonth) {
        this.costPerMonth = costPerMonth;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public RealEstate(double squareMeters, double costPerMonth) {
        this.id = nextId++;
        this.squareMeters = squareMeters;
        this.costPerMonth = costPerMonth;
    }

    public RealEstate(double squareMeters, double costPerMonth, Owner owner, Client client) {
        this(squareMeters, costPerMonth);
        this.owner = owner;
        this.client = client;

    }

    public void printRealEstateInfo() {
        System.out.println("Id: " + id + ". Square meters: " + squareMeters + "\nCost per month: " + costPerMonth);
        if (client == null && owner == null) {
            System.out.println("No Clients' and Owners' information");
        } else {
            client.printClientInfo();
            owner.printOwnerInfo();
        }
    }
}


