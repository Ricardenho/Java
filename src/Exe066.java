import java.util.Scanner;

/* Desenvolva um programa que leia quatro valores pelo teclado e guarde-os em um vetor. No final, mostre:

A) Quantas vezes apareceu o valor 9.
B) Em que posição foi digitado o primeiro valor 3.
C) Quais foram os números pares.*/
public class Exe066 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer[] vect = new Integer[4];
		int numNove=0, numTres = -1;
		
		System.out.print("Primeiro valor: ");
		vect[0] = sc.nextInt();
		
		System.out.print("Segundo valor: ");
		vect[1] = sc.nextInt();
		
		System.out.print("Terceiro valor: ");
		vect[2] = sc.nextInt();
		
		System.out.print("Quarto valor: ");
		vect[3] = sc.nextInt();
		
		for(int i=0;i<4;i++) {
			if(vect[i].equals(9)) {
				numNove++;
			}
			
			if(vect[i].equals(3)) {
				if(numTres==-1) {
					numTres=i;
				}	
			}
		}
		
		System.out.println("O numero 9 Apareceu: " + numNove + " Vez(es)");
		System.out.printf("O numero 3 Apareceu pela primeira vez na: %d Posição\n",numTres + 1);
		System.out.print("Os numero pares Foram: ");
		for(int i=0;i<4;i++) {
			if(vect[i]%2==0) {
				System.out.print(vect[i] + " ");
			}
		}
		sc.close();

	}

}
