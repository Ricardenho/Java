import java.util.Scanner;

/*Escreva um programa que fa�a o computador "pensar" em um n�mero inteiro entre 0 e 5
 * e pe�a para o usu�rio tentar descobrir qual foi o n�mero escolhido pelo computador.
 * O programa dever� escrever na tela se o usu�rio venceu ou perdeu.
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
