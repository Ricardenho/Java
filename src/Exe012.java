import java.util.Scanner;

//Fa�a um algoritmo que leia o pre�o de um produto e mostre seu novo pre�o, com 5% de desconto.
public class Exe012 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double preco = sc.nextDouble();
		
		System.out.printf("Pre�o com Desconto %.2f", preco - (preco*0.05));
		
		sc.close();

	}

}
