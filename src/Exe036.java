import java.util.Scanner;

/*Crie um programa que leia duas notas de um aluno e calcule sua m�dia,
 * mostrando uma mensagem no final, de acordo com a m�dia atingida:
- M�dia abaixo de 5.0: REPROVADO
- M�dia entre 5.0 e 6.9: RECUPERA��O
- M�dia 7.0 ou superior: APROVADO*/
public class Exe036 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double n1, n2, media;
		
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		media = (n1+n2)/2;
		if(media >= 7) {
			System.out.printf("M�dia: %.1f\nSitua��o: APROVADO", media);
		}else if(media >=5 && media <7){
			System.out.printf("M�dia: %.1f\nSitua��o: RECUPERA��O", media);
		}else {
			System.out.printf("M�dia: %.1f\nSitua��o: REPROVADO", media);
		}
		
		sc.close();
	}

}
