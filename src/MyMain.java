import creditCard.CreditCard;

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
    }
}
