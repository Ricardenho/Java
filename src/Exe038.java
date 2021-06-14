import java.util.Scanner;

/*Refaça o DESAFIO 031 dos triângulos, acrescentando o recurso de mostrar que tipo de triângulo será formado:
- EQUILÁTERO: todos os lados iguais
- ISÓSCELES: dois lados iguais, um diferente
- ESCALENO: todos os lados diferentes*/
public class Exe038 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double reta1 = sc.nextDouble();
		double reta2 = sc.nextDouble();
		double reta3 = sc.nextDouble();
		
		if(reta1 < reta2+reta3 && reta2 < reta1+reta3 && reta3 < reta2+reta1) {
			System.out.printf("Pode formar um triângulo\n");
			if(reta1 == reta2 && reta1 == reta3) {
				System.out.println("Triângulo EQUILÁTERO");
			}else if(reta1 != reta2 && reta1 !=reta3) {
				System.out.println("Triângulo ESCALENO");
			}else {
				System.out.println("Triângulo ISÓCELES2");
			}
			
		}else {
			System.out.printf("Não pode formar um triângulo");
		}
		
		sc.close();


	}

}
