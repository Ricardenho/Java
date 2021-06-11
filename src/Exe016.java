import java.util.Scanner;

// Crie um programa que leia um número Real qualquer pelo teclado e mostre na tela a sua porção Inteira.
public class Exe016 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double num = sc.nextDouble();
		
		System.out.printf("parte Inteira: %d", (int)num);
		
		sc.close();
	}

}
