import java.util.Scanner;

// Crie um programa que leia um n�mero inteiro e mostre na tela se ele � PAR ou �MPAR.
public class Exe026 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Integer escolha = sc.nextInt();
		
		if(escolha % 2 ==0) {
			System.out.printf("%d � Par", escolha);
		}else {
			System.out.printf("%d � Impar", escolha);
		}
		
		
		sc.close();

	}

}
