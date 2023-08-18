package assignmentJava;
public class BankAppAbstract {

	public static void main(String[] args) {
		SavingsAccount sa1 = new SavingsAccount("354117711905","Srinidhi",2200,6.7);
		sa1.getAccountHolderName();
		sa1.getAccountNumber();
		//sa1.deposit(1000);
		sa1.withdraw(1050);
		CheckingAccount ca1 = new CheckingAccount("354117711905","Srinidhi",2000,1000);
		ca1.getAccountHolderName();
		ca1.getAccountNumber();
		//ca1.deposit(1000);
		ca1.withdraw(1000);
	}

}


abstract class BankAccount{
	protected String accountNumber;
	public  void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	protected String accountHolderName;
	private static double balance;
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		BankAccount.balance = balance;
	}
	abstract void getAccountNumber();
	abstract void getAccountHolderName();
	abstract void deposit(double amount);
	abstract void withdraw(double amount);
	
}
class SavingsAccount extends BankAccount{
	private double interestRate;
	private static double minimumBalance = 2000;
	public static double getMinimumBalance() {
		return minimumBalance;
	}
	SavingsAccount(String accountNumber, String accountHolderName, double balance, double interestRate){
		this.interestRate = interestRate;
		setBalance(balance);
		setAccountNumber(accountNumber);
		setAccountHolderName(accountHolderName);
	}
	 void getAccountNumber() {
	System.out.println(accountNumber);
	}
	void getAccountHolderName(){
		System.out.println(accountHolderName);
	}
	void deposit(double amount) {
		double amt = getBalance();
		amt = amt + amount;
		setBalance(amt);
		System.out.println(amount+ " is deposited in savings account and the new balance is "+ getBalance());
		
	}
	void withdraw(double amount) {
		double amt = getBalance();
		amt = amt - amount;
		if(amt>=minimumBalance) {
		setBalance(amt);
		System.out.println(amount+ " is withdrawn in savings account and the new balance is "+ getBalance());}
		else {System.out.println("Can't withdraw since the minimum balance should be " + minimumBalance +" and your balance is "+ getBalance());
		}
	}
}
class CheckingAccount extends BankAccount{
	private double overdraftLimit;
	CheckingAccount(String accountNumber, String accountHolderName, double balance,double overdraftLimit){
		this.overdraftLimit = overdraftLimit;
		setBalance(balance);
		setAccountNumber(accountNumber);
		setAccountHolderName(accountHolderName);
	}
	
	void getAccountNumber() {
		System.out.println(accountNumber);
	}
	void getAccountHolderName(){
		System.out.println(accountHolderName);		
	}
	void deposit(double amount) {
	double amt = getBalance();
	amt = amt + amount;
	setBalance(amt);
	System.out.println(amount+ " is deposited in checking account and the new balance is "+ getBalance());
	}
	void withdraw(double amount) {
		if(amount <= overdraftLimit && (getBalance()-amount) >= SavingsAccount.getMinimumBalance()) {
			double amt = getBalance();
			amt = amt - amount;
			setBalance(amt);
			System.out.println(amount+ " is withdrawn in checking account and the new balance is "+ getBalance());}
		else {
			System.out.println("Sorry the entered amount is exceeding the overdraft limit");
	}
}
	}

