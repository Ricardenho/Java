import java.util.Scanner;

//Fa�a um programa que leia um �ngulo qualquer e mostre na tela o valor do seno, cosseno e tangente desse �ngulo.
public class Exe018 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double ang = sc.nextDouble();
		ang = Math.toRadians(ang);
		System.out.printf("seno: %.2f\n", Math.sin(ang));
		System.out.printf("cosseno: %.2f\n", Math.cos(ang));
		System.out.printf("tangente: %.2f", Math.tan(ang));
		
		sc.close();

	}

}
