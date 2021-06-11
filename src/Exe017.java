import java.util.Scanner;

/*Faça um programa que leia o comprimento do cateto oposto e do cateto adjacente de um triângulo retângulo.
 * Calcule e mostre o comprimento da hipotenusa.
 */

public class Exe017 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double co = sc.nextDouble();
		double ca = sc.nextDouble();
		
		System.out.printf("hipotenusa: %.2f", Math.hypot(co, ca));
		
		sc.close();

	}

}
