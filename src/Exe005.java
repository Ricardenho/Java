import java.util.Scanner;

//Fa�a um programa que leia um n�mero Inteiro e mostre na tela o seu sucessor e seu antecessor.
public class Exe005 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Integer x = sc.nextInt();
		System.out.println("O sucessor de " + x + " = " + (x+1));
		System.out.println("O antecessor de " + x + " = " + (x-1));
		
		sc.close();
		
	}

}
