import java.util.Scanner;

//Fa�a um programa que leia um n�mero inteiro e diga se ele � ou n�o um n�mero primo.
public class Exe048 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int total = 0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				total++;
			}
		}
		if(total==2 || total==1) {
			System.out.printf("O numero %d foi divis�vel %d vezes\n", num , total);
			System.out.println("E por isso ele � um numero PRIMO");
		}else {
			System.out.printf("O numero %d foi divis�vel %d vezes\n", num , total);
			System.out.println("E por isso ele N�O � um numero PRIMO");
		}
		
		sc.close();
	}

}
