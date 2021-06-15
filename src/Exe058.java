import java.util.Scanner;

//Escreva um programa que leia um número N inteiro qualquer e mostre na tela os N primeiros elementos de uma Sequência de Fibonacci. 
public class Exe058 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt()-2;
		int n1 = 0;
		int n2 = 1;
		System.out.print(n1 + "->" + n2 + " -> ");
		while (num != 0) {
			int n3 = n1+n2;
			System.out.print(n3 + " -> ");
			
			n1 = n2;
			n2 = n3;
			num--;
		}

		System.out.println("Fim de Programa");
		
		sc.close();
	}
}