import java.util.Scanner;

//Crie um algoritmo que leia um número e mostre o seu dobro, triplo e raiz quadrada.
public class Exe006 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Integer x = sc.nextInt();
		
		System.out.printf("O dobro de %d = %d", x, x*2);
		System.out.printf("O triplo de %d = %d", x, x*3);
		System.out.printf("O A raizQ de %d = %.2f", x, Math.sqrt(x));
		
		
		sc.close();
	}

}
