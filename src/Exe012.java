import java.util.Scanner;

//Faça um algoritmo que leia o preço de um produto e mostre seu novo preço, com 5% de desconto.
public class Exe012 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double preco = sc.nextDouble();
		
		System.out.printf("Preço com Desconto %.2f", preco - (preco*0.05));
		
		sc.close();

	}

}
