import java.util.Scanner;

//Faça um algoritmo que leia o salário de um funcionário e mostre seu novo salário, com 15% de aumento.

public class Exe013 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double salario = sc.nextDouble();
		
		System.out.printf("Novo salario: %.2f", salario*1.15 );
		
		sc.close();
	}

}
