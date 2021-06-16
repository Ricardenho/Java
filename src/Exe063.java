import java.util.Scanner;

/*Crie um programa que tenha um vetor totalmente preenchida com uma contagem por extenso,
 * de zero até vinte. Seu programa deverá ler um número pelo teclado (entre 0 e 20) e mostrá-lo por extenso.
 */
public class Exe063 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] vect = new String[] {
		"Zero", "Um", "Dois", "Três", "Quatro", "Cinco", "Seis", "Sete", "Oito", "Nove", "Dez","Onze", "Doze",
		"Treze", "Quatorze","Quize", "Dezesseis", "Dezessete", "Dezoito", "Dezenove", "Vinte" };

		
		System.out.print("Escolha um numero entre 0 e 20: ");
		int esc= sc.nextInt();
		System.out.println(esc + " por extenso é: " + vect[esc]);
		
		
		sc.close();
	}

}
