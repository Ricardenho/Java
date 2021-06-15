import java.util.Scanner;

// Refaça o DESAFIO 047, lendo o primeiro termo e a razão de uma PA, mostrando os 10 primeiros termos da progressão usando a estrutura while.
public class Exe056 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int primeiroTermo = sc.nextInt();
		int razao = sc.nextInt();
		int i = 10;
		while(i >= 1) {
			System.out.print(primeiroTermo +" -> ");
			primeiroTermo+=razao;
			i--;
		}
		
		
		System.out.println("ACABOU");
		
		sc.close();

	}

}
