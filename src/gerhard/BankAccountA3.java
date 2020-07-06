package gerhard;

public class BankAccountA3 {
    int MoneyAmount;

    public void BankAccount(){
        MoneyAmount = 2500;
    }

    public void addMoney(int add){
        MoneyAmount += add;
    }

    public void withdrawMoney(int withdraw){
        MoneyAmount -= withdraw;
        if(MoneyAmount <0){
            System.out.printf("\nYou have gone into minus! %d", MoneyAmount);
        }
    }
    public void moneyAmount(){
        System.out.printf("\nYou have %d on your bank Account!", MoneyAmount);
    }

    public static void main(String[] args) {
        BankAccountA3 account = new BankAccountA3();
        account.moneyAmount();
        account.withdrawMoney(10);
        account.moneyAmount();
        account.addMoney(150);
        account.moneyAmount();
        account.addMoney(150);
        account.moneyAmount();
        account.addMoney(150);
        account.withdrawMoney(3000);
        account.moneyAmount();
        account.addMoney(1050);
    }
}
