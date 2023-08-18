package assignmentJava.TestQuestions;

class Bank{
	private int accountNumber;
	private long balance;
	private String ownerName;
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getOwnerName(String ownerName) {
		return ownerName;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
		System.out.println("Hi " + ownerName);
		System.out.println("Your balance is : "+balance);
	}
	
	public void withDraw(long amt) {
		balance = balance -amt;
		System.out.println("Hello " + ownerName);
		System.out.println(amt +" amount withdrawn and new balance is: " +balance);
	}
	
	public void deposit(long amt) {
		balance = balance + amt;
		System.out.println("Hello " + ownerName);
		System.out.println(amt +" amount deposited and new balance is: " +balance);
	}
}
public class BankApplication {
public static void main(String[] args) {
	Bank user1 = new Bank();
	user1.setOwnerName("Srindhi");
	user1.setBalance(20000);
//	user1.deposit(500);
//	user1.withDraw(2000);
}
}

