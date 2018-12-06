package course;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two integers numbers: ");
		int digito1 = sc.nextInt();
		int digito2 = sc.nextInt();
		int cont = 0;
		if (digito1 < digito2) {
			while (digito1 <= digito2) {
				if (digito1 % 2 != 0) {
				cont = cont + digito1;
			}
				digito1 += 1;
		}
			} else if (digito2 <= digito1) {
			while (digito2 <= digito1) {
				if (digito2 % 2 != 0) {
				cont = cont + digito2;
			}
				digito2 += 1;
		}	
	}
		System.out.println("Sum of odd numbers =  " + cont);
		sc.close();
		}
}
