import java.util.Scanner;

/* Desenvolva um programa que leia o nome, sexo e idade de 4 pessoas.
 * No final do programa, mostre: a média de idade do grupo,
 * qual é o nome do homem mais velho e quantas mulheres têm menos de 20 anos.
 */
public class Exe051 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		String nomeVelho = null;
		int idadeVelho=0;
		int m20Anos=0;
		double media=0;
		
		for(int i=1;i<=4;i++) {
			System.out.printf("Nome: ");
			String nome = sc.nextLine();
			System.out.printf("Sexo [M/F]: ");
			String sexo = sc.nextLine();
			System.out.printf("Idade: ");
			int idade = sc.nextInt();
			sc.nextLine();
			
			if(sexo.toUpperCase().equals("M")) {
				if(idade > idadeVelho) {
					idadeVelho = idade;
					nomeVelho = nome;
				}
			}
			if(sexo.toUpperCase().equals("F") && idade <20) {
				m20Anos++;
			}
			
			media+=idade;
		}
		System.out.printf("O homem mais velho tem %d anos, e se chama %s\n", idadeVelho, nomeVelho);
		System.out.printf("Ao todo tivemos %d mulheres com menos de 20 anos\n", m20Anos);
		System.out.printf("A media de idade do grupo é de %.1f anos\n", media/4);
		
		sc.close();
	}

}
