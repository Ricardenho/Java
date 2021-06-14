import java.util.Scanner;

/*Crie um programa que leia duas notas de um aluno e calcule sua média,
 * mostrando uma mensagem no final, de acordo com a média atingida:
- Média abaixo de 5.0: REPROVADO
- Média entre 5.0 e 6.9: RECUPERAÇÃO
- Média 7.0 ou superior: APROVADO*/
public class Exe036 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double n1, n2, media;
		
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		media = (n1+n2)/2;
		if(media >= 7) {
			System.out.printf("Média: %.1f\nSituação: APROVADO", media);
		}else if(media >=5 && media <7){
			System.out.printf("Média: %.1f\nSituação: RECUPERAÇÃO", media);
		}else {
			System.out.printf("Média: %.1f\nSituação: REPROVADO", media);
		}
		
		sc.close();
	}

}
