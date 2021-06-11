import java.util.Scanner;


//Faça um programa que leia um número Inteiro qualquer e mostre na tela a sua tabuada.

public class Exe009 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		Integer x = sc.nextInt();
		
		System.out.printf("%d x 1 = %d\n", x, x*1);
		System.out.printf("%d x 2 = %d\n", x, x*2);
		System.out.printf("%d x 3 = %d\n", x, x*3);
		System.out.printf("%d x 4 = %d\n", x, x*4);
		System.out.printf("%d x 5 = %d\n", x, x*5);
		System.out.printf("%d x 6 = %d\n", x, x*6);
		System.out.printf("%d x 7 = %d\n", x, x*7);
		System.out.printf("%d x 8 = %d\n", x, x*8);
		System.out.printf("%d x 9 = %d\n", x, x*9);
		System.out.printf("%d x 10 = %d", x, x*10);
		
		sc.close();
	}

}
