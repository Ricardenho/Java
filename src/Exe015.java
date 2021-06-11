import java.util.Scanner;

/*Escreva um programa que pergunte a quantidade de Km percorridos por um carro alugado
 * e a quantidade de dias pelos quais ele foi alugado.
 * Calcule o preço a pagar, sabendo que o carro custa R$60 por dia e R$0,15 por Km rodado.*/
public class Exe015 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double km = sc.nextDouble();
		Integer dias = sc.nextInt();
		
		System.out.printf("Custo: R$%.2f", dias*60+km*0.15);
		
		sc.close();


	}

}
