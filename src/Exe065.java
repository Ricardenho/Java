import java.util.Random;
import java.util.Scanner;

/*Crie um programa que vai gerar cinco números aleatórios e colocar em um vetor.
 * Depois disso, mostre a listagem de números gerados e também indique o menor e o maior valor..
 */
public class Exe065 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random gerador = new Random();
	
		Integer[] vect = new Integer[] {gerador.nextInt(100), gerador.nextInt(100), gerador.nextInt(100), gerador.nextInt(100), gerador.nextInt(100)};
		int maior=vect[0], menor=vect[0];
		
		for(int i=0; i<5; i++) {
			System.out.print(vect[i] + " ");
			if (vect[i]>maior) {
				maior=vect[i];
			}
			if (vect[i]<menor) {
				menor=vect[i];
			}
		}
		
		System.out.println("\nO maior numero gerado foi: " + maior);
		System.out.println("O menor numero gerado foi: " + menor);
		
		sc.close();
	}

}
