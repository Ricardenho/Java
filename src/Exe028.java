import java.util.Scanner;

//Fa�a um programa que leia um ano qualquer e mostre se ele � bissexto.
public class Exe028 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Integer ano = sc.nextInt();
		
		if(ano%4==0 && (ano%100!=0 || ano%400==0)) {
			System.out.printf("O ano %d � BISSEXTO", ano);
		}else {
			System.out.printf("O ano %d N�O � BISSEXTO", ano);
		}
		
		
		sc.close();

	}

}
