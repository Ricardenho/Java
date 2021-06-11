import java.util.Scanner;

//Escreva um programa que converta uma temperatura digitando em graus Celsius e converta para graus Fahrenheit.
public class Exe014 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double temperatura = sc.nextDouble();
		
		System.out.printf("Fahrenheit: %.2f", (temperatura *9/5) + 32);
		
		sc.close();

	}

}
