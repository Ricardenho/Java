import java.util.Scanner;

//Melhore o DESAFIO 056, perguntando para o usuário se ele quer mostrar mais alguns termos. O programa encerrará quando ele disser que quer mostrar 0 termos.
public class Exe057 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int primeiroTermo = sc.nextInt();
		int razao = sc.nextInt();
		int i = 10;
		while (i != 0) {
			while(i >= 1) {
				System.out.print(primeiroTermo +" -> ");
				primeiroTermo+=razao;
				i--;
			}
			System.out.println("PAUSA");
			System.out.print("Quantos termos vc quer mostrar a mais? ");
			i = sc.nextInt();
		}

		System.out.println("Fim de Programa");
		
		sc.close();
	}
}
