import java.util.Scanner;

/*Faça um programa que leia a largura e a altura de uma parede em metros,
 * calcule a sua área e a quantidade de tinta necessária para pintá-la,
 * sabendo que cada litro de tinta pinta uma área de 2 metros quadrados.
 */
public class Exe011 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double alt = sc.nextDouble();
		double lar = sc.nextDouble();
		double area = alt*lar;
		
		System.out.printf("Serão necessarios %.1f litros de tinta", area/2);
		
		
		
		sc.close();

	}

}
