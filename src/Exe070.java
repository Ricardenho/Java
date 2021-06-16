import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Crie um programa que vai ler vários números e colocar em uma lista. Depois disso,
 * crie duas listas extras que vão conter apenas os valores pares e os valores ímpares digitados,
 * respectivamente. Ao final, mostre o conteúdo das três listas geradas.
 */
public class Exe070 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		List<Integer> list =new ArrayList<>();
		List<Integer> impares =new ArrayList<>();
		List<Integer> pares =new ArrayList<>();
		String resp = "S";
		
		
		while(resp.toUpperCase().equals("S")) {
			System.out.print("Digite um Valor: ");
			int x = sc.nextInt();
			int contem = 0;
			for(int i=0;i<list.size();i++) {
				if(list.get(i) == x) {
					contem++;
				}
			}
			if(contem==0) {
				list.add(x);
			}
			sc.nextLine();
			System.out.printf("Quer Continuar: [S/N] ");
			resp = sc.nextLine();
		}
		
		
		for(Integer num : list){
			if(num%2==0) {
				pares.add(num);
			}
			else {
				impares.add(num);
			}
		}
		
		System.out.println("Lista Completa: ");
		System.out.println(list);
		System.out.println("Lista Pares: ");
		System.out.println(pares);
		System.out.println("Lista Impares: ");
		System.out.println(impares);
		
		
		sc.close();

	}

}
