package testing.example.bank;

/**
 * A really trivial example to experiment with Mutation Testing.
 * 
 * @author Lorenzo Bettini
 */
public class SimpleBankAccount {

	private double balance = 0;

	public SimpleBankAccount() {

	}

	public SimpleBankAccount(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		if (amount < 0) {
			throw new IllegalArgumentException("Negative amount: " + amount);
		}
		balance += amount;
	}

}
