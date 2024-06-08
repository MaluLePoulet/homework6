import realEstate.Client;
import realEstate.Owner;
import realEstate.RealEstate;

public class MyMain {
    public static void main(String[] args) {

        RealEstate apart1 = new RealEstate(62.5, 550.0);
        RealEstate apart2 = new RealEstate(36.9, 230.0,
                new Owner(0, "Tom Dallas", "+7345634759"),
                new Client(1, "Lorry Williams", 29, false));

        apart1.printRealEstateInfo();
        System.out.printf("%n");
        apart2.printRealEstateInfo();
        System.out.printf("%n");


    }
}
