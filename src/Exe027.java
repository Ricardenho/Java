import java.util.Scanner;

/*Desenvolva um programa que pergunte a dist�ncia de uma viagem em Km.
 * Calcule o pre�o da passagem, cobrando R$0,50 por Km para viagens de at� 200Km e R$0,45 parta viagens mais longas.
 */
public class Exe027 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double km = sc.nextDouble();
		
		if(km <= 200) {
			System.out.printf("Pre�o: R$%.2f", km*0.5);
		}else {
			System.out.printf("Pre�o: R$%.2f", km*0.45);
		}
		
		
		sc.close();

	}

}
