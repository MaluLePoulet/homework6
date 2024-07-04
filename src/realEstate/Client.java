package realEstate;

public class Client {

    private int id;

    private String name;

    private int age;

    private boolean isRegistered;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isRegistered() {
        return isRegistered;
    }

    public void setRegistered(boolean registered) {
        isRegistered = registered;
    }

    public Client(int id, String name, int age, boolean isRegistered) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.isRegistered = isRegistered;
    }

    public void printClientInfo() {
        if (isRegistered) {
            System.out.println("Id: " + id + ". Client's name: " + name + "\nAge: " + age + " y.o. \nis registered in the apartment!");
        } else {
            System.out.println("Id: " + id + ". Client's name: " + name + "\nAge: " + age + "y.o. \nis not registered in the apartment!");
        }
    }
}

