package atm;

import java.util.Scanner;

public class Atm {

    private int amountOfTwenties;

    private int amountOfFifties;

    private int amountOfHundreds;

    private final int TWENTY = 20;

    private final int FIFTY = 50;

    private final int HUNDRED = 100;


    public Atm(int amountOf0Twenties, int amountOfFifties, int amountOfHundreds) {
        this.amountOfTwenties = amountOf0Twenties;
        this.amountOfFifties = amountOfFifties;
        this.amountOfHundreds = amountOfHundreds;
    }

    public void addMoney(int amountToAdd) {
        int resultOfCalculation = amountToAdd;
        while (resultOfCalculation != 0) {
            if (resultOfCalculation >= HUNDRED) {
                resultOfCalculation = resultOfCalculation - HUNDRED;
                amountOfHundreds++;
            } else if (resultOfCalculation >= FIFTY) {
                resultOfCalculation = resultOfCalculation - FIFTY;
                amountOfFifties++;
            } else if (resultOfCalculation >= TWENTY) {
                resultOfCalculation = resultOfCalculation - TWENTY;
                amountOfTwenties++;
            } else {
                System.out.println("This ATM accepts only 20, 50, 100.\n" + resultOfCalculation + " dollars are not acceptable!");
                break;
            }
        }
        System.out.println("Deposit of " + amountToAdd + " dollars was successful!");
        printAmountOfBanknotes();
    }

    public void printAmountOfBanknotes() {
        System.out.println("Available banknotes - 20 x " + amountOfTwenties
                + "\nAvailable banknotes - 50 x " + amountOfFifties
                + "\nAvailable banknotes - 100 x " + amountOfHundreds);
    }

    public boolean withdrawMoney() {
        boolean status = false;
        while (amountOfTwenties > 0 | amountOfFifties > 0 | amountOfHundreds > 0) {
            System.out.println("Enter the amount of money you want to withdraw: ");
            Scanner scanner = new Scanner(System.in);
            int moneyToWithdraw = scanner.nextInt();

            int totalAmount = amountOfTwenties * TWENTY + amountOfFifties * FIFTY + amountOfHundreds * HUNDRED;
            if (moneyToWithdraw > totalAmount) {
                System.out.println("Insufficient funds!");

            }
            for (int twentiesUsed = 0; twentiesUsed <= amountOfTwenties; twentiesUsed++) {
                for (int fiftiesUsed = 0; fiftiesUsed <= amountOfFifties; fiftiesUsed++) {
                    for (int hundredsUsed = 0; hundredsUsed <= amountOfHundreds; hundredsUsed++) {
                        int currentAmount = (hundredsUsed * HUNDRED) + (fiftiesUsed * FIFTY) + (twentiesUsed * TWENTY);
                        if (currentAmount == moneyToWithdraw) {

                            amountOfHundreds -= hundredsUsed;
                            amountOfFifties -= fiftiesUsed;
                            amountOfTwenties -= twentiesUsed;
                            System.out.println("Amount requested: " + moneyToWithdraw + "\nBanknotes used: "
                                    + HUNDRED + " x " + hundredsUsed + "; "
                                    + FIFTY + " x " + fiftiesUsed + "; "
                                    + TWENTY + " x " + twentiesUsed + "\nOperation successful!");
                            printAmountOfBanknotes();
                            status = true;
                        }
                    }
                }
            }
        }
        return status;
    }
}
