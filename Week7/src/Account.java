//OK. O.Aktunc

import java.util.Date;

public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	public Account(){
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date(System.currentTimeMillis());
		
	}
	
	

	public Account(int id, double balance, double annualInterestRate, Date dateCreated) {
		super();
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		this.dateCreated = dateCreated;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}
	
	public double getMonthlyInterestRate(){
		return annualInterestRate/12;
	}
	
	public double withdraw(double amt){
		double out;
		if(amt < 0){
			System.out.println("ERROR: You cannot withdraw a negative amount.");
			out = 0;
		}else if (amt >balance){
			System.out.println("ERROR: You have overdrawn from your account. Withdrawing remaining funds.");
			out = balance;
			balance = 0;
		}
		else out  = amt;
		balance -= amt;
		
		return out;
	}
	/*public void withdraw(double amt){
		double out;
		if(amt < 0){
			System.out.println("ERROR: You cannot withdraw a negative amount.");
		}else if (amt >balance){
			System.out.println("ERROR: You have overdrawn from your account. Withdrawing remaining funds.");
			balance = 0;
		}else{
			balance -= amt;
		}
		
	}*/
	public void deposit(double amt){
		balance += amt;
		return;
	}
}
