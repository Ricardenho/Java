import java.util.Scanner;

/*Refa�a o DESAFIO 031 dos tri�ngulos, acrescentando o recurso de mostrar que tipo de tri�ngulo ser� formado:
- EQUIL�TERO: todos os lados iguais
- IS�SCELES: dois lados iguais, um diferente
- ESCALENO: todos os lados diferentes*/
public class Exe038 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double reta1 = sc.nextDouble();
		double reta2 = sc.nextDouble();
		double reta3 = sc.nextDouble();
		
		if(reta1 < reta2+reta3 && reta2 < reta1+reta3 && reta3 < reta2+reta1) {
			System.out.printf("Pode formar um tri�ngulo\n");
			if(reta1 == reta2 && reta1 == reta3) {
				System.out.println("Tri�ngulo EQUIL�TERO");
			}else if(reta1 != reta2 && reta1 !=reta3) {
				System.out.println("Tri�ngulo ESCALENO");
			}else {
				System.out.println("Tri�ngulo IS�CELES2");
			}
			
		}else {
			System.out.printf("N�o pode formar um tri�ngulo");
		}
		
		sc.close();


	}

}
