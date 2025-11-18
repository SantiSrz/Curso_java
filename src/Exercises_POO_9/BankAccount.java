package Exercises_POO_9;

public class BankAccount {
	
	double balance;
	
	public BankAccount(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double cantidad) {
        balance = balance + cantidad;
        System.out.print(balance);
	}
}
