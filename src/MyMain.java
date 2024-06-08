import atm.Atm;

public class MyMain {
    public static void main(String[] args) {

        Atm atm = new Atm(10,10,10);
        atm.addMoney(3200);
        atm.withdrawMoney();
        //atm.withdrawByAmountOfBanknotes(1,1,1);
    }
}
