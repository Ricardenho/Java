import java.util.Scanner;

/*Melhore o jogo do DESAFIO 024 onde o computador vai "pensar" em um n�mero entre 0 e 10.
 * S� que agora o jogador vai tentar adivinhar at� acertar, mostrando no final quantos palpites foram necess�rios para vencer.
 */
public class Exe053 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Integer sorteado = (int)(Math.random() *10);
		Integer palpites=1;
		
		System.out.println("Sou seu Computador, pensei num n�mero de 0 a 10.");
		System.out.println("Qual o seu Palpite: ");
		Integer esc = sc.nextInt();
		while (esc!=sorteado) {
			
			if(esc<sorteado) {
				System.out.println("MAIS...");
				esc = sc.nextInt();
			}
			if(esc>sorteado){
				System.out.println("MENOS...");
				esc = sc.nextInt();
			}
			palpites++;
		}
		
		System.out.printf("Acertou com %d tentativas", palpites);
		sc.close();

	}

}
