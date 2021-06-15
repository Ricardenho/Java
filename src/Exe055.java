import java.util.Scanner;

/*Faça um programa que leia um número qualquer e mostre o seu fatorial.

Ex: 5! = 5 x 4 x 3 x 2 x 1 = 120*/
public class Exe055 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Integer num = sc.nextInt();
		Integer total=1;
		System.out.printf("Calculando %d! ", num);
		while(num != 0) {
			total*=num;
			if(num != 1) {
				System.out.print(num + " x ");
			}else {
				System.out.print(num + " = ");
			}
			num--;
			
		}
		System.out.println(total);
		sc.close();
	}

}
