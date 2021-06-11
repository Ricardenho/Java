import java.util.Scanner;

/* Escreva um programa que leia dois números inteiros e compare-os. mostrando na tela uma mensagem:
- O primeiro valor é maior
- O segundo valor é maior
- Não existe valor maior, os dois são iguais*/

public class Exe034 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Integer n1 = sc.nextInt();
		Integer n2 = sc.nextInt();

		if(n1 > n2) {
			System.out.printf("%d é maior que %d",n1, n2);
		}else if(n2 > n1) {
			System.out.printf("%d é maior que %d", n2, n1);
		}else {
			System.out.printf("%d é igual a %d", n1, n2);
		}
		
		sc.close();

	}

}
