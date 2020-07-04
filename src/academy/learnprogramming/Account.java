/*
Java Program to demonstrate the working of a banking-system where we deposit and withdraw amount from our account.
*/
package academy.learnprogramming;
public class Account {
    int accountNumber;
    float balance;
    String name;

    // Creating a parameterized constructor
    public Account(int accNumber, float accBalance, String accName){
        accountNumber = accNumber;
        balance = accBalance;
        name = accName;
    }

    public static void main(String[] args){
        Account acc = new Account(12345, 10000, "Shrikant");
        System.out.println("Account details for " + acc.name + " is as follows:");
        System.out.println("Account Number: " + acc.accountNumber);
        System.out.println("Available Balance: " + acc.balance);
        acc.deposit(1000);
        acc.checkAccountBalance();
        acc.withdraw(5000);
        acc.checkAccountBalance();
        acc.withdraw(7000);
        acc.checkAccountBalance();
    }

    private void deposit(float amount) {
        balance = balance + amount;
        System.out.println("Total amount in account after deposit is " + balance);
    }

    private void withdraw(float amount) {
        if (balance < amount) {
            System.out.println("Insufficient balance in account");
        } else {
            balance = balance - amount;
            System.out.println("Total amount in account after withdraw is " + balance);
        }
    }

    private void checkAccountBalance(){
        System.out.println("Balance is: " + balance);
    }
}
