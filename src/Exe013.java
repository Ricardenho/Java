import java.util.Scanner;

//Fa�a um algoritmo que leia o sal�rio de um funcion�rio e mostre seu novo sal�rio, com 15% de aumento.

public class Exe013 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double salario = sc.nextDouble();
		
		System.out.printf("Novo salario: %.2f", salario*1.15 );
		
		sc.close();
	}

}
