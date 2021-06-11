import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*O mesmo professor do desafio 019 quer sortear a ordem de apresentação de trabalhos dos alunos.
 * Faça um programa que leia o nome dos quatro alunos e mostre a ordem sorteada.
 */
public class Exe020 {

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
		 Collections.shuffle(lista);
		System.out.println("Ordem: " + lista);
		
		
		sc.close();

	}

}
