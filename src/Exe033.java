import java.util.Scanner;

/*Escreva um programa em Python que leia um n�mero inteiro qualquer
 * e pe�a para o usu�rio escolher qual ser� a base de convers�o:
 * 1 para bin�rio,
 * 2 para octal e
 * 3 para hexadecimal.
 */
public class Exe033 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Integer num = sc.nextInt();
		System.out.println("[1] Binario");
		System.out.println("[2] Octal");
		System.out.println("[3] Hexadecimal");
		Integer esc = sc.nextInt();
		if(esc == 1) {
			System.out.printf("%d na base 2 = %s", num, Integer.toBinaryString(num));
		}else if(esc == 2) {
			System.out.printf("%d na base 8 = %s", num, Integer.toOctalString(num));
		}else if(esc == 2) {
			System.out.printf("%d na base 16 = %s", num, Integer.toHexString(num));
		}else {
			System.out.println("Valor incorreto");
		}
		
		sc.close();

	}

}
