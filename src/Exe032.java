import java.util.Scanner;

/*Escreva um programa para aprovar o empréstimo bancário para a compra de uma casa.
 * Pergunte o valor da casa, o salário do comprador e em quantos anos ele vai pagar.
 * A prestação mensal não pode exceder 30% do salário ou então o empréstimo será negado.
 */
public class Exe032 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double valorCasa = sc.nextDouble();
		double salario = sc.nextDouble();
		Integer anos = sc.nextInt();
		
		if(valorCasa/(anos*12) <= (salario*0.30)) {
			System.out.printf("Emprestimo APROVADO");
		}else {
			System.out.printf("Emprestimo NEGADO");
		}
		
		sc.close();

	}

}
