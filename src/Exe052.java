import java.util.Scanner;

//Fa�a um programa que leia o sexo de uma pessoa, mas s� aceite os valores 'M' ou 'F'.
//Caso esteja errado, pe�a a digita��o novamente at� ter um valor correto.
public class Exe052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String sexo = null;
		System.out.println("Informe seu Sexo [M/F]: ");
		sexo = sc.nextLine();

		while (!sexo.toUpperCase().equals("M") && !sexo.toUpperCase().equals("F")) {
			System.out.println("Dados Invalidos. Por favor, Informe seu sexo: ");
			sexo = sc.nextLine();
		}
		
		System.out.printf("Sexo %s registrado com sucesso.", sexo);
		sc.close();
	}

}
