import java.util.Scanner;

/*Escreva um programa em Python que leia um número inteiro qualquer
 * e peça para o usuário escolher qual será a base de conversão:
 * 1 para binário,
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
