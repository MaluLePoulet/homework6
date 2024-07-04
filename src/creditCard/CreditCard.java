package creditCard;

public class CreditCard {

    private static int nextId;

    private int id;

    private String accountNumber;

    private double cardBalance;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getCardBalance() {
        return cardBalance;
    }

    public void setCardBalance(double cardBalance) {
        if (cardBalance < 0) {
            System.out.println("Invalid input! Balance cannot be less than 0!");
        } else {
            this.cardBalance += cardBalance;
        }
    }

    public CreditCard(String accountNumber, double cardBalance) {
        this.id = nextId++;
        this.accountNumber = accountNumber;
        this.cardBalance = cardBalance;
        printAccountInfo();
    }

    public void addAmountOfMoney(double amountOfMoneyToAdd) {
        setCardBalance(amountOfMoneyToAdd);
        System.out.println(amountOfMoneyToAdd + " successfully added to your account!");
        printBalanceInfo();
    }

    public void removeAmountOfMoney(double amountOfMoneyToRemove) {
        if (amountOfMoneyToRemove > cardBalance) {
            System.out.println("Insufficient funds!");
        } else {
            cardBalance -= amountOfMoneyToRemove;
            System.out.println(amountOfMoneyToRemove + " successfully removed to your account!");
        }
        printBalanceInfo();
    }

    private void printBalanceInfo() {
        System.out.println("Current balance is: " + cardBalance);
    }

    public void printAccountInfo() {
        System.out.println("Account id: " + id + ". Account number: " + accountNumber + ". Current balance: " + cardBalance);
    }
}
