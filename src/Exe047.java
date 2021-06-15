import java.util.Scanner;

//Desenvolva um programa que leia o primeiro termo e a razão de uma PA. No final, mostre os 10 primeiros termos dessa progressão.
public class Exe047 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int primeiroTermo = sc.nextInt();
		int razao = sc.nextInt();
		
		for(int i=0;i<10;i++) {
			System.out.print(primeiroTermo +" -> ");
			primeiroTermo+=razao;
		}
		
		
		System.out.println("ACABOU");
		
		sc.close();
	}

}
