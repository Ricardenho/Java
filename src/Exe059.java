import java.util.Scanner;

/* Crie um programa que leia v�rios n�meros inteiros pelo teclado.
 * O programa s� vai parar quando o usu�rio digitar o valor 999, que � a condi��o de parada.
 * No final, mostre quantos n�meros foram digitados e qual foi a soma entre eles (desconsiderando o flag).
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
		System.out.printf("Foram digitado %d numeros e a soma deles � %d",digitados, total);
		sc.close();
		

	}

}
