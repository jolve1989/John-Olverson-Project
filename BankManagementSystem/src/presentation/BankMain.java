package presentation;

public class BankMain {
	private String customer;
	private double account;
	private double deposit;

	Public BankMain(){
		
	super();
	
	}
	 
	public BankMain(String customer, double account, double deposit) {
	super();
	this.account = account;
	this.customer = customer;
	this.deposit = deposit;
	
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public double getAccount() {
		return account;
	}

	public void setAccount(double account) {
		this.account = account;
	}

	public double getDeposit() {
		return deposit;
	}

	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}
	
}
