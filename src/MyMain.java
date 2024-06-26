import creditCard.CreditCard;
import realEstate.Client;
import realEstate.Owner;
import realEstate.RealEstate;

public class MyMain {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard("7645", 200.0);
        creditCard.addAmountOfMoney(300.0);

        System.out.printf("%n");

        CreditCard secondCreditCard = new CreditCard("9823", 1000.0);
        secondCreditCard.addAmountOfMoney(230.5);

        System.out.printf("%n");

        CreditCard thirdCreditCard = new CreditCard("6380", 600.0);
        thirdCreditCard.removeAmountOfMoney(100.0);

        System.out.printf("%n");
      
              RealEstate apartment1 = new RealEstate(62.5, 550.0);
        RealEstate apartment2 = new RealEstate(36.9, 230.0,
                new Owner(0, "Tom Dallas", "+7345634759"),
                new Client(1, "Lorry Williams", 29, false));

        apartment1.printRealEstateInfo();
        System.out.printf("%n");
        apartment2.printRealEstateInfo();
        System.out.printf("%n");
    }
}
