//Desenvolva um programa que leia as duas notas de um aluno, calcule e mostre a sua média.
import java.util.Scanner;

public class Exe007 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		
		
		System.out.printf("A media de %.1f e %.1f = %.2f", n1, n2 , (n1+n2)/2);
		
		sc.close();
	}

}
