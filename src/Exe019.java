import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Um professor quer sortear um dos seus quatro alunos para apagar o quadro.
 * Faça um programa que ajude ele, lendo o nome dos alunos e escrevendo na tela o nome do escolhido.
 */
public class Exe019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<String> lista = new ArrayList<String>();
		String nome1 = sc.next();
		lista.add(nome1);
		String nome2 = sc.next();
		lista.add(nome2);
		String nome3 = sc.next();
		lista.add(nome3);
		String nome4 = sc.next();
		lista.add(nome4);
		
		
		System.out.println("Escolhido: " +  lista.get((int)(Math.random() * lista.size())));
		
		
		sc.close();

	}

}
