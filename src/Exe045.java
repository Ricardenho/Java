import java.util.Scanner;

//Refaça o DESAFIO 009, mostrando a tabuada de um número que o usuário escolher, só que agora utilizando um laço for.

public class Exe045 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int esc = sc.nextInt();
		for (int i =1;i<=10;i++) {
			System.out.printf("%d x %d = %d\n", esc, i, esc*i);
		}
		sc.close();
	}
	
}
