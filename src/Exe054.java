import java.util.Scanner;

/*Crie um programa que leia dois valores e mostre um menu na tela:
[ 1 ] somar
[ 2 ] multiplicar
[ 3 ] maior
[ 4 ] novos números
[ 5 ] sair do programa
Seu programa deverá realizar a operação solicitada em cada caso.*/
public class Exe054 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite n1: ");
		Integer n1 = sc.nextInt();
		System.out.println("Digite n2: ");
		Integer n2 = sc.nextInt();
		Integer esc = 0;
		
		
		while (esc != 5) {
			System.out.println("[ 1 ] somar\r\n"
					+ "[ 2 ] multiplicar\r\n"
					+ "[ 3 ] maior\r\n"
					+ "[ 4 ] novos números\r\n"
					+ "[ 5 ] sair do programa");
			esc = sc.nextInt();
			if(esc == 1) {
				System.out.printf("A soma entre %d + %d = %d\n", n1, n2,n1+n2);
			}else if(esc == 2) {
				System.out.printf("A subtração entre %d * %d = %d\n", n1, n2,n1*n2);
			}else if(esc == 3) {
				if(n1 > n2) {
					System.out.printf("O maior entre %d e %d é %d\n", n1,n2, n1);
				}else if(n1 < n2) {
					System.out.printf("O maior entre %d e %d é %d\n", n1,n2, n2);
				}else {
					System.out.println("Ambos são Iguais\n");
				}
				
			}else if(esc == 4) {
				System.out.println("Digite n1: ");
				n1 = sc.nextInt();
				System.out.println("Digite n2: ");
				n2 = sc.nextInt();
			}
			else if(esc <1 || esc>5) {
				System.out.println("Valor Incorreto\n");
			}
			
			System.out.println("=========================================================================================");
			
		}
		System.out.println("Fim de Programa");
		sc.close();

	}

}
