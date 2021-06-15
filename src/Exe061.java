import java.util.Scanner;

//Faça um programa que mostre a tabuada de vários números, um de cada vez,
//para cada valor digitado pelo usuário. O programa será interrompido quando o número solicitado for negativo. 
public class Exe061 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		while(num >= 0) {
			System.out.printf("Digite o valor da Tabuada: ");
			num =sc.nextInt();
			if(num>=0) {
				for(int i=1; i<=10;i++) {
					System.out.printf("%d x %d = %d\n", num, i, num*i);
				}
			}
			
			System.out.println("=================================================================");
			
		}
		System.out.println("Fim de Programa");
		sc.close();

	}

}
