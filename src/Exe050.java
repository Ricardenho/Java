import java.util.Locale;
import java.util.Scanner;

//Faça um programa que leia o peso de cinco pessoas. No final, mostre qual foi o maior e o menor peso lidos.
public class Exe050 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double peso;
		
		double maior =0, menor = 0;
		for(int i =1;i<=5;i++) {
			System.out.printf("Peso da %dª Pessoa: ", i);
			peso = sc.nextDouble();
			if(i==1) {
				maior = peso;
				menor = peso;
			}else {
				if(peso>maior) {
					maior = peso;
				}
				if(peso<menor){
					menor = peso;
				}
			}
			
		}
		
		System.out.printf("O maior peso lido foi: %.1fKg\n",maior);
		System.out.printf("O menor peso lido foi: %.1fKg\n",menor);
		sc.close();

	}

}
