import java.util.Random;
import java.util.Scanner;

//Crie um programa que faça o computador jogar Jokenpô com você.

public class Exe041 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random gerador = new Random();
		
		System.out.println("[0] PEDRA");
		System.out.println("[1] PAPEL");
		System.out.println("[2] TESOURA");
		
		Integer esc = sc.nextInt();
		Integer cpu = gerador.nextInt(3);
		
		if (esc == 0 && cpu ==0) {
			System.out.println("Jogador escolheu PEDRA");
			System.out.println("CPU escolheu PEDRA");
			System.out.println("EMPATE");
		}else if (esc == 1 && cpu ==0) {
			System.out.println("Jogador escolheu PAPEL");
			System.out.println("CPU escolheu PEDRA");
			System.out.println("Jogador VENCEU");
		}else if (esc == 2 && cpu ==0) {
			System.out.println("Jogador escolheu TESOURA");
			System.out.println("CPU escolheu PEDRA");
			System.out.println("CPU VENCEU");
		}
		
		else if (esc == 0 && cpu == 1) {
			System.out.println("Jogador escolheu PEDRA");
			System.out.println("CPU escolheu PAPEL");
			System.out.println("CPU venceu");
		}else if (esc == 1 && cpu == 1) {
			System.out.println("Jogador escolheu PAPEL");
			System.out.println("CPU escolheu PAPEL");
			System.out.println("EMPATE");
		}else if (esc == 2 && cpu == 1) {
			System.out.println("Jogador escolheu TESOURA");
			System.out.println("CPU escolheu PAPEL");
			System.out.println("Jogador VENCEU");
		}
		
		else if (esc == 0 && cpu == 2) {
			System.out.println("Jogador escolheu PEDRA");
			System.out.println("CPU escolheu TESOURA");
			System.out.println("jogador VENCEU");
		}else if (esc == 1 && cpu == 2) {
			System.out.println("Jogador escolheu PAPEL");
			System.out.println("CPU escolheu TESOURA");
			System.out.println("CPU VENCEU");
		}else if (esc == 2 && cpu == 2) {
			System.out.println("Jogador escolheu TESOURA");
			System.out.println("CPU escolheu TESOURA");
			System.out.println("EMPATE");
		}
		
		else {
			System.out.println(esc + " Valor incorreto ");
		}
		
		
		
		sc.close();

	}

}
