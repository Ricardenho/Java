import java.util.Scanner;

/*Desenvolva uma lógica que leia o peso e a altura de uma pessoa, calcule seu Índice de Massa Corporal (IMC) e mostre seu status, de acordo com a tabela abaixo:
- IMC abaixo de 18,5: Abaixo do Peso
- Entre 18,5 e 25: Peso Ideal
- 25 até 30: Sobrepeso
- 30 até 40: Obesidade
- Acima de 40: Obesidade Mórbida*/
public class Exe039 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double peso = sc.nextDouble();
		double altura = sc.nextDouble();
		double imc = peso/(altura*altura);
		
		if(imc <18.5) {
			System.out.printf("IMC: %.1f - ABAIXO DO PESO", imc);
		}else if(imc >= 18.5 && imc < 25) {
			System.out.printf("IMC: %.1f - PESO IDEAL", imc);
		}else if(imc >= 25 && imc < 30) {
			System.out.printf("IMC: %.1f - ACIMA DO PESO", imc);
		}else if(imc >= 30 && imc < 40) {
			System.out.printf("IMC: %.1f - OBESIDADE", imc);
		}else {
			System.out.printf("IMC: %.1f - OBESIDADE MÓRBIDA", imc);	
		}
		
		sc.close();


	}

}
