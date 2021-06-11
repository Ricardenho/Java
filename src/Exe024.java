import java.util.Scanner;

/*Escreva um programa que faça o computador "pensar" em um número inteiro entre 0 e 5
 * e peça para o usuário tentar descobrir qual foi o número escolhido pelo computador.
 * O programa deverá escrever na tela se o usuário venceu ou perdeu.
 */
public class Exe024 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer sorteado = (int)(Math.random() *5);
		
		Integer num = sc.nextInt();
		
		if(num == sorteado) {
			System.out.println("Acertou");
		}else {
			System.out.println("Errou");
		}
		
		
		sc.close();

	}

}
