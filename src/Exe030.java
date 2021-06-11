import java.util.Scanner;

/*Escreva um programa que pergunte o salário de um funcionário e calcule o valor do seu aumento.
 * Para salários superiores a R$1250,00, calcule um aumento de 10%. Para os inferiores ou iguais, o aumento é de 15%.
 */

public class Exe030 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double salary = sc.nextDouble();
		
		if(salary > 1250) {
			System.out.printf("Novo Salario: R$%.2f", salary*1.10);
		}else {
			System.out.printf("Novo Salario: R$%.2f", salary*1.15);
		}
		
		sc.close();

	}

}
