import java.util.Scanner;


//Escreva um programa que leia um valor em metros e o exiba convertido em cent�metros e mil�metros.
public class Exe008 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		double x = sc.nextDouble();
		
		System.out.printf("%.1f m = %.2f cm \n", x, x*100);
		System.out.printf("%.1f m = %.2f mm", x, x*1000);
		
		sc.close();
	}

}
