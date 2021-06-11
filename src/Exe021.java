import java.util.Scanner;

/* Crie um programa que leia o nome completo de uma pessoa e mostre: 
- O nome com todas as letras maiúsculas e minúsculas.
- Quantas letras ao todo (sem considerar espaços).*/

public class Exe021 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nome = sc.next();
		
		System.out.println("Maiusculas: " + nome.toUpperCase());
		System.out.println("Minusculas: " + nome.toLowerCase());
		System.out.println("Letras:" + nome.length());
		
		
		sc.close();
	}

}
