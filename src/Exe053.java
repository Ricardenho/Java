import java.util.Scanner;

/*Melhore o jogo do DESAFIO 024 onde o computador vai "pensar" em um número entre 0 e 10.
 * Só que agora o jogador vai tentar adivinhar até acertar, mostrando no final quantos palpites foram necessários para vencer.
 */
public class Exe053 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Integer sorteado = (int)(Math.random() *10);
		Integer palpites=1;
		
		System.out.println("Sou seu Computador, pensei num número de 0 a 10.");
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
