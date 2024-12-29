package Testing;
class BankAccount{
	double balance;
	
	public BankAccount() {
		this.balance = 0.0;
	}
	
	public double getBalance() {
		return balance;
	}
	public void depsoit(double amount) {
		if (amount > 0) {
			balance += amount;
		}else {
			
		}
	}
	public boolean withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			return true;
		}
		return false;
	}
	
}
public class W4Q3 {
	public static void main(String[] args) {
		
	}

}
