import java.util.Scanner;

/*Escreva um programa para aprovar o empr�stimo banc�rio para a compra de uma casa.
 * Pergunte o valor da casa, o sal�rio do comprador e em quantos anos ele vai pagar.
 * A presta��o mensal n�o pode exceder 30% do sal�rio ou ent�o o empr�stimo ser� negado.
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
