package application;

import java.util.Locale;
import java.util.Scanner;

import entities.rendedProduct;

public class rendedProblem {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		rendedProduct[] vect = new rendedProduct[10];
		
		System.out.print("How many rooms will be rended? ");
		int n= sc.nextInt();
		
		for(int line = 1; line <= n; line++) {
			System.out.println("\nRent #" + line + ": ");
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			
			vect[room] = new rendedProduct(name, email);
		}
		
		System.out.println("\nBusy rooms: ");
		for(int line = 0; line < 10; line++) {
			if(vect[line] != null) {
				System.out.println(line + ": " + vect[line].getName() + ", " + vect[line].getEmail());
			}
		}
		sc.close();
	}
}
