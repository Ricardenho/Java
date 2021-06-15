import java.util.Scanner;

/* Crie um programa que leia vários números inteiros pelo teclado.
 * O programa só vai parar quando o usuário digitar o valor 999, que é a condição de parada.
 * No final, mostre quantos números foram digitados e qual foi a soma entre eles (desconsiderando o flag).
 */
public class Exe059 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int total=0, num=0, digitados=0;
		
		while(num!=999) {
			System.out.print("Digite um numero: ");
			num = sc.nextInt();
			if(num != 999) {
				total+=num;
				digitados++;
			}
		}
		System.out.printf("Foram digitado %d numeros e a soma deles é %d",digitados, total);
		sc.close();
		

	}

}
