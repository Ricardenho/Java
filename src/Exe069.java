import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Crie um programa onde o usuário possa digitar vários valores numéricos e cadastre-os em uma lista.
 * Caso o número já exista lá dentro, ele não será adicionado. No final,
 * serão exibidos todos os valores únicos digitados.
 */
public class Exe069 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Integer> list =new ArrayList<>();
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
		for(Integer num : list) {
			System.out.println(num);
		}
		
		
		sc.close();
	}
}
