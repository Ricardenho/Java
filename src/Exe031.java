import java.util.Scanner;

//Desenvolva um programa que leia o comprimento de três retas e diga ao usuário se elas podem ou não formar um triângulo.
public class Exe031 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double reta1 = sc.nextDouble();
		double reta2 = sc.nextDouble();
		double reta3 = sc.nextDouble();
		
		if(reta1 < reta2+reta3 && reta2 < reta1+reta3 && reta3 < reta2+reta1) {
			System.out.printf("Pode formar um triângulo");
		}else {
			System.out.printf("Não pode formar um triângulo");
		}
		
		sc.close();

	}

}
