package testing.example.bank;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleBankAccountTest {

	@Test
	public void testDepositWhenAmountIsCorrectShouldIncreaseBalance() {
		SimpleBankAccount bankAccount = new SimpleBankAccount(5);
		bankAccount.deposit(10);
		assertEquals(15, bankAccount.getBalance(), 0);
	}

	@Test
	public void testDepositWhenAmountIsNegativeShouldThrow() {
		// setup
		SimpleBankAccount bankAccount = new SimpleBankAccount();
		try {
			// exercise
			bankAccount.deposit(-1);
			fail("Expected an IllegalArgumentException to be thrown");
		} catch (IllegalArgumentException e) {
			// verify
			assertEquals("Negative amount: -1.0", e.getMessage());
			assertEquals(0, bankAccount.getBalance(), 0);
		}
	}

}
