package application;

import java.util.Locale;
import java.util.Scanner;

public class ExerciseHeadquarter {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How much lines the headquarter 'll have? ");
		int NUMBER_OF_COLUMMS = sc.nextInt();
		System.out.print("How much columms the headquarter 'll have? ");
		int NUMBER_OF_LINES = sc.nextInt();
		
		int headquarter[][] = new int[NUMBER_OF_LINES][NUMBER_OF_COLUMMS];
		
		System.out.println("Type the headquarter: ");
		for(int line = 0; line < headquarter.length; line++) {
			for(int columm = 0; columm < headquarter[columm].length; columm++) {
				headquarter[line][columm] = sc.nextInt();
			}
		}
		
		System.out.print("What ocurrency you wanna find? ");
		int OCURRENCY = sc.nextInt();
		
		for(int line = 0; line < headquarter.length; line++) {
			for(int columm = 0; columm < headquarter[columm].length; columm++) {
				if(headquarter[line][columm] == OCURRENCY) {
					System.out.println("---------------------------");
					System.out.println("Position: " + line + ", " + columm);
					if(columm > 0) {
						System.out.println("Left: " + headquarter[line][columm-1]);
					}
					
					if(line > 0) {
						System.out.println("Up: " + headquarter[line-1][columm]);
					}
					
					if(columm < headquarter[line].length) {
						System.out.println("Right: " + headquarter[line][columm-1]);
					}
					
					if(line < headquarter.length-1) {
						System.out.println("Right: " + headquarter[line+1][columm]);
					}
				}
			}
		}
		
		sc.close();
		
	}

}
