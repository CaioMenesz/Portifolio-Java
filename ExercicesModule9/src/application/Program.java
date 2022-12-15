package application;

import java.util.Locale;
import java.util.Scanner;
import util.BankAccount;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number ID: ");
		int idAccount = sc.nextInt();
		
		System.out.print("Enter the account holder: ");
		String nameAccount = sc.next();
		System.out.print("Do u wanna deposit some initial value?(y/n)");
		sc.nextLine();
		char answer = sc.next().charAt(0);
		
		BankAccount bak = new BankAccount(idAccount, nameAccount);
		if (answer != 'n') {
			System.out.print("Enter the initial deposit value: ");
			double initDeposit = sc.nextDouble();
			bak.depositValue(initDeposit);
		} else {}
		
		/*OTHER WAY TO DO IF: 
		 * 
		 * WITHOUT USING IT | BankAccount bak = new BankAccount(idAccount, nameAccount);
			
			if (answer == 'y') {
				System.out.print("Enter the initial deposit value: ");
				double initDeposit = sc.nextDouble();
				bak = new BankAccount(idAccount, nameAccount, initDeposit);
			} else {
				bak = new BankAccount(idAccount, nameAccount);
			}
		 * 
		 * */
		
		System.out.println("Account data: \n" + bak);
		
		System.out.print("\nEnter a deposit value: ");
		double initDeposit = sc.nextDouble();
		bak.depositValue(initDeposit);
		
		System.out.println("\nUpdated data: \n" + bak);
	
		System.out.print("\nEnter a withdraw value: ");
		initDeposit = sc.nextDouble();
		bak.withDraw(initDeposit);
		
		System.out.println("\nUpdated data: \n" + bak);
		
		sc.close();
		
	}
}