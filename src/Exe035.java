import java.util.Scanner;

/*Fa�a um programa que leia o ano de nascimento de um jovem e informe,
 * de acordo com a sua idade, se ele ainda vai se alistar ao servi�o militar,
 * se � a hora exata de se alistar ou se j� passou do tempo do alistamento.
 * Seu programa tamb�m dever� mostrar o tempo que falta ou que passou do prazo.
 */
public class Exe035 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Integer nasc = sc.nextInt();

		if(2020 - nasc >=18) {
			System.out.printf("Voc� tem %d anos, ja pode se Alistar",2020-nasc);
		}else{
			System.out.printf("Voc� tem %d anos, n�o pode se Alistar\nvolte em %d anos",2020-nasc, 18-(2020-nasc));
		}
		
		sc.close();

	}

}
