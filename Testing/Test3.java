package Testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class Test3 {
	@Test
	public void testDeposit() {
		BankAccount account = new BankAccount();
		account.depsoit(100.0);
		assertEquals(100.0,account.getBalance(),0.001,"Balance is 100.");
	}
	@Test
	public void testwithdrawal() {
		BankAccount account = new BankAccount();
		account.depsoit(100.0);
		boolean result = account.withdraw(50.0);
		assertTrue(result, "Withdrawal 50");
		assertEquals(50.0,account.getBalance(),0.001,"Balance is 50.");
	}
	@Test
	public void testWithdrawalFailure() {
		BankAccount account = new BankAccount();
		account.depsoit(100.0);
		account.withdraw(50.0);
		boolean result = account.withdraw(60.0);
		assertFalse(result,"Insufficient balance.");
		assertEquals(50.0,account.getBalance(),0.001);
	}

}
