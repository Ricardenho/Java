import java.util.Scanner;

/*Fa�a um programa que leia a largura e a altura de uma parede em metros,
 * calcule a sua �rea e a quantidade de tinta necess�ria para pint�-la,
 * sabendo que cada litro de tinta pinta uma �rea de 2 metros quadrados.
 */
public class Exe011 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double alt = sc.nextDouble();
		double lar = sc.nextDouble();
		double area = alt*lar;
		
		System.out.printf("Ser�o necessarios %.1f litros de tinta", area/2);
		
		
		
		sc.close();

	}

}
