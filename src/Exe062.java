import java.util.Random;
import java.util.Scanner;

/*Fa�a um programa que jogue par ou �mpar com o computador.
 * O jogo s� ser� interrompido quando o jogador perder, mostrando o total de vit�rias consecutivas que ele conquistou no final do jogo. 
 */


public class Exe062 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cpu=0, jog=0, pOUi=0, esc=0, rd = 0;

		while(cpu == 0) {
			
			Random gerador = new Random();
			rd = gerador.nextInt(10);
			System.out.println("PAR[0] OU IMPAR[1]....");
			pOUi= sc.nextInt();
			System.out.println("0 a 10: ");
			esc = sc.nextInt();
			if((esc+rd)%2==pOUi) {
				System.out.println("Jogador Venceu");
				jog++;
			}
			else {cpu++;}
			
		}
		System.out.printf("CPU Venceu depois de %d vezes\n", jog);
		System.out.println("Fim de Programa");
		sc.close();

	}

}
