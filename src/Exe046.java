import java.util.Scanner;

// Desenvolva um programa que leia seis números inteiros e mostre a soma apenas daqueles que forem pares. Se o valor digitado for ímpar, desconsidere-o.

public class Exe046 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = 0;
		for(int i=1; i<=6;i++) {
			int x = sc.nextInt();
			if(x%2==0) {
				total+=x;
			}
		}
		System.out.println("A soma dos pares é: " + total);
		
		sc.close();
	}

}
