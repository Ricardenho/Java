import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Faça um programa que leia 5 valores numéricos e guarde-os em uma lista.
//No final, mostre qual foi o maior e o menor valor digitado e as suas respectivas posições na lista. 
public class Exe068 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Integer> list =new ArrayList<>();
		Integer maior=0, menor=0;
		for(int i=0; i <5;i++) {
			System.out.print("Digite um Valor: ");
			list.add(sc.nextInt());
				maior = list.get(0);
				menor = list.get(0);
			
		}
		for(Integer num : list) {
			if(num > maior) {
				maior = num;
			}
			if(num < menor) {
				menor = num;
			}
		}
		
		System.out.println("O maior valor foi: " + maior);
		System.out.println("O menor valor foi: " + menor);
		
		sc.close();
	}

}
