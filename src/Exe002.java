import java.util.Scanner;

//Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boas-vindas.

public class Exe002 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nome = sc.nextLine();
		
		System.out.println("Seja bem vindo(a) " + nome);
		
		sc.close();
	}

}
