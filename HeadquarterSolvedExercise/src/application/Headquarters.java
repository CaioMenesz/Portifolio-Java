package application;

import java.util.Locale;
import java.util.Scanner;

public class Headquarters {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] headquarter = new int[n][n];
		
		for (int line = 0; line < headquarter.length; line++) {
			for (int columm = 0; columm < headquarter[columm].length; columm++) {
				headquarter[line][columm] = sc.nextInt();
			}
		}
		
		
		System.out.println("Main diagonal: ");
		for(int line = 0; line < headquarter.length; line++) {
			System.out.print(headquarter[line][line] + " ");
		}
		System.out.println();
		
		int count = 0;
		for(int line = 0; line < headquarter.length; line++) {
			for (int columm = 0; columm < headquarter[columm].length; columm++) {
				if(headquarter[line][columm] < 0) {
					count++;
				}
			}
		}
		System.out.println("Negative numbers = " + count);
		
		sc.close();
	
	}
	
}
