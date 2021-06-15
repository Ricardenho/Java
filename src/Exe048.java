import java.util.Scanner;

//Faça um programa que leia um número inteiro e diga se ele é ou não um número primo.
public class Exe048 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int total = 0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				total++;
			}
		}
		if(total==2 || total==1) {
			System.out.printf("O numero %d foi divisível %d vezes\n", num , total);
			System.out.println("E por isso ele é um numero PRIMO");
		}else {
			System.out.printf("O numero %d foi divisível %d vezes\n", num , total);
			System.out.println("E por isso ele NÃO é um numero PRIMO");
		}
		
		sc.close();
	}

}
