package util;

public class BankAccount {
	
	private int idAccount;
	private String nameAccount;
	private double initDeposit;
	private char answer; /*doesn`t necessary to private it there*/
	
	public BankAccount(){}
	
	public BankAccount(int idAccount, String nameAccount, double initDeposit){
		this.idAccount = idAccount;
		this.nameAccount = nameAccount;
		this.initDeposit = initDeposit;
	}
	
	public BankAccount(int idAccount, String nameAccount) {
		this.idAccount = idAccount;
		this.nameAccount = nameAccount;
		initDeposit = 0;
	}
	
	public int getId(){
		return idAccount;
	}
	
	public void setId(int idAccount){
		this.idAccount = idAccount;
	}
	
	public String getName() {
		return nameAccount;
	}
	
	public void setName(String nameAccount){
		this.nameAccount = nameAccount;
	}
	
	public double getInit(){
		return initDeposit;
	}
	
	public void depositValue(double initDeposit) {
		this.initDeposit += initDeposit;
	}
	
	public double Tax = -5;
	public void withDraw(double initDeposit /*or other variable, like `amount`*/) {
		this.initDeposit -= initDeposit - Tax; /*Instead using Tax var, change to | this.initDeposit -= initDeposit + 5.0;*/
	}
	
	public String toString() {
		return "Account of "
				+nameAccount
				+ " with ID: "
			    +idAccount
			    + ", have $ "
			    +String.format("%.2f", initDeposit);
	}
	
}