package realEstate;

public class Owner {

    private int id;

    private String name;

    private String mobileNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;

    }

    public Owner(int id, String name, String mobileNumber) {
        this.id = id;
        this.name = name;
        this.mobileNumber = mobileNumber;

    }

    public void printOwnerInfo() {
        System.out.println("Id: " + id + ". Owner's name: " + name + "\nMobile number: " + mobileNumber);
    }
}
