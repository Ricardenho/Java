import java.util.Scanner;

//Fa�a um programa que leia tr�s n�meros e mostre qual � o maior e qual � o menor.

public class Exe029 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		Integer n1 = sc.nextInt();
		Integer n2 = sc.nextInt();
		Integer n3 = sc.nextInt();
		
		if(n1 >= n2 && n1>=n3) {
			System.out.printf("%d � o maior\n", n1);
			if(n2<=n3) {
				System.out.printf("%d � o menor", n2);
			}else {System.out.printf("%d � o menor", n3);}
		}
		else if(n2 >= n1 && n2>=n3) {
			System.out.printf("%d � o maior\n", n2);
			if(n1<=n3) {
				System.out.printf("%d � o menor", n1);
			}else {System.out.printf("%d � o menor", n3);}
		}
		else {
			System.out.printf("%d � o maior\n", n3);
			if(n1<=n2) {
				System.out.printf("%d � o menor", n1);
			}else {System.out.printf("%d � o menor", n2);}
		}
			
		sc.close();
	}
}
