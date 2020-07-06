package irati.A3;

public class BankAccount {
    double initial_amount;

    public BankAccount(){
        this.initial_amount = 2350.0;
    }

    public void addMoney(double added){
        this.initial_amount += added;
    }
    public void withdrawMoney(double withdraw){
        this.initial_amount -= withdraw;
        if (this.initial_amount<0){
            System.out.println("You are in red numbers!");
        }
    }
    public void printResult(){
        System.out.println(this.initial_amount);
    }
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.printResult();
        account.addMoney(35);
        account.printResult();
        account.withdrawMoney(65);
        account.printResult();
        account.withdrawMoney(2000);
        account.printResult();
        account.withdrawMoney(400);
        account.printResult();
    }
}
