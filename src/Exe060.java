import java.util.Scanner;

/*Crie um programa que leia v�rios n�meros inteiros pelo teclado. No final da execu��o,
 * mostre a m�dia entre todos os valores e qual foi o maior e o menor valores lidos.
 * O programa deve perguntar ao usu�rio se ele quer ou n�o continuar a digitar valores.
 */
public class Exe060 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		int num=0, digitados=0, maior=0, menor=0;
		double total=0;
		String resp ="S";
		
		while(resp.toUpperCase().equals("S")) {
			System.out.print("Digite um numero: ");
			num = sc.nextInt();
			if(digitados==0) {
				maior = num;
				menor = num;
			}
			total+=num;
			digitados++;
			if(num > maior) {
				maior = num;
			}
			if(num < menor) {
				menor = num;
			}
			System.out.printf("Deseja continuar [S/N]: ");
			sc.nextLine();
			resp = sc.nextLine();
			if(!resp.toUpperCase().equals("S") && !resp.toUpperCase().equals("N")) {
				System.out.println("Valor Incorreto");
				System.out.printf("Deseja continuar [S/N]: ");
				resp = sc.nextLine();
			}
		}
		System.out.printf("Foram digitado %d numeros e a media deles � %.1f\n",digitados, total/digitados);
		System.out.printf("O maiot valor foi %d e o menor foi %d", maior, menor);
		sc.close();

	}

}
