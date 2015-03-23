
//OK. O.Aktunc
import java.util.Date;

public class TestAccount {
	
	public static void main(String[] args) {
		
		Account account = new Account(1122, 20000, .045, new Date(System.currentTimeMillis()));
		account.withdraw(2500);
		account.deposit(3000);
		
		System.out.println("Balance: " + account.getBalance());
		System.out.println("Interest Rate: " + account.getMonthlyInterestRate());
		System.out.println("Date Created: " + account.getDateCreated().toString());
		
		
	}
}
