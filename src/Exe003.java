import java.util.Scanner;

//Crie um programa que leia dois números e mostre a soma entre eles.
public class Exe003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double n1, n2;
		
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		
		System.out.println(n1 + " + " + n2 + " = " + (n1+n2));
		
		
		sc.close();
	}

}
