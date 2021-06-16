import java.util.Scanner;

/*Crie um programa que tenha uma tupla única com nomes de produtos e seus respectivos preços,
 * na sequência. No final, mostre uma listagem de preços, organizando os dados em forma tabular.
 */
public class Exe067 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] vect = new String[] {
				"Lápis",  "1.75", "Borracha", "2.00", "Caderno",
				"15.90", "Estojo",	  "25.00", "Transferidor", "4.20",
				"Compasso",	  "9.99",	  "Mochila", "120.32", "Canetas",
				"22.30",	  "Livro",  "34.90"};

		
		System.out.println("LISTAGEM");
		for(int i=0;i<vect.length;i+=2) {
			System.out.print(vect[i].toUpperCase() + "................R$" + vect[i+1]);
			System.out.print("\n");
		}
		
		sc.close();

	}

}
