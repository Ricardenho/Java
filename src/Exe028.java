import java.util.Scanner;

//Faça um programa que leia um ano qualquer e mostre se ele é bissexto.
public class Exe028 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Integer ano = sc.nextInt();
		
		if(ano%4==0 && (ano%100!=0 || ano%400==0)) {
			System.out.printf("O ano %d é BISSEXTO", ano);
		}else {
			System.out.printf("O ano %d NÃO É BISSEXTO", ano);
		}
		
		
		sc.close();

	}

}
