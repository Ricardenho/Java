import java.util.Scanner;

/* Escreva um programa que leia a velocidade de um carro. Se ele ultrapassar 80Km/h,
 * mostre uma mensagem dizendo que ele foi multado. A multa vai custar R$7,00 por cada Km acima do limite.
 */


public class Exe025 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double vel = sc.nextDouble();
		
		if(vel > 80) {
			System.out.printf("Multa de R$%.2f", (vel-80)*7);
		}
		
		
		sc.close();
	}

}
