import java.util.Arrays;
import java.util.Scanner;

/*Crie um vetor preenchido com os 20 primeiros colocados da Tabela do Campeonato Brasileiro de Futebol, na ordem de colocação.
 * Data: 16/06/2021
 Depois mostre: 
a) Os 5 primeiros times.
b) Os últimos 4 colocados.
c) Em que posição está o time da Chapecoense.
d) Times em ordem alfabética.
*/
public class Exe064 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] vect = new String[] {
				"Fortaleza",  "Atletico-PR", "Flamengo", "Atletico-GO", "Atletico-MG",
				"Bragantino", "Fluminense",	  "Bahia", "Palmeiras", "Corinthians",
				"Ceara",	  "Santos",	  "Internacional", "Juventude", "Cuiabá",
				"Sport",	  "São Paulo",  "Chapecoense", "Gremio", "America-MG"};

		System.out.print("Primeiros 5 Colocados: ");
		for(int i=0;i<5;i++) {
			System.out.print(vect[i].toUpperCase() + " ");
		}
		
		System.out.print("\nOs 4 ultimos colocados: ");
		for(int i=vect.length-1;i>vect.length-5;i--) {
			System.out.print(vect[i].toUpperCase() + " ");
		}
		 
		 for(int i=0;i<vect.length;i++) {
			 if(vect[i].toUpperCase().equals("CHAPECOENSE")) {
				 System.out.printf("\nPosição da Chapecoense: %d Lugar",i+1);
			 } 
		}
		 
		 Arrays.sort(vect);
		 
		 System.out.println("\nTimes Ordenados Alfabeticamente: ");
		 for(int i=0;i<vect.length;i++) {
				System.out.print(vect[i].toUpperCase() + " - ");
			}

		sc.close();
	}
}
