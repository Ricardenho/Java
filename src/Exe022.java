import java.util.Scanner;

//Crie um programa que leia o nome de uma cidade diga se ela começa ou não com o nome "SANTO".
public class Exe022 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nome = sc.next().toUpperCase();
		
		System.out.println(nome.contains("SANTO"));
		
		
		sc.close();

	}

}
