import java.util.Scanner;

/*Fa�a um programa que leia uma frase pelo teclado e mostre quantas vezes aparece a letra "A",
 * em que posi��o ela aparece a primeira vez e em que posi��o ela aparece a �ltima vez.
*/
public class Exe023 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nome = sc.next().toUpperCase();
		
		System.out.println("Primeira: " + nome.indexOf("A"));
		System.out.println("Ultima: " + nome.lastIndexOf("A"));
		
		
		sc.close();
	}

}
