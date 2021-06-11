import java.util.Scanner;

// Crie um programa que leia um número inteiro e mostre na tela se ele é PAR ou ÍMPAR.
public class Exe026 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Integer escolha = sc.nextInt();
		
		if(escolha % 2 ==0) {
			System.out.printf("%d é Par", escolha);
		}else {
			System.out.printf("%d é Impar", escolha);
		}
		
		
		sc.close();

	}

}
