import java.util.Scanner;

//Crie um programa que leia quanto dinheiro uma pessoa tem na carteira e mostre quantos dólares ela pode comprar.

public class Exe010 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double real = sc.nextDouble();
		
		System.out.printf("R$%.2f equivalem U$%.2f", real, real*5.06);
		
		
		sc.close();
	}

}
