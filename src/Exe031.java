import java.util.Scanner;

//Desenvolva um programa que leia o comprimento de tr�s retas e diga ao usu�rio se elas podem ou n�o formar um tri�ngulo.
public class Exe031 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double reta1 = sc.nextDouble();
		double reta2 = sc.nextDouble();
		double reta3 = sc.nextDouble();
		
		if(reta1 < reta2+reta3 && reta2 < reta1+reta3 && reta3 < reta2+reta1) {
			System.out.printf("Pode formar um tri�ngulo");
		}else {
			System.out.printf("N�o pode formar um tri�ngulo");
		}
		
		sc.close();

	}

}
