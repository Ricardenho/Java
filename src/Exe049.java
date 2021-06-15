import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

// Crie um programa que leia uma frase qualquer e diga se ela é um palíndromo, desconsiderando os espaços.
public class Exe049 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Calendar cal = GregorianCalendar.getInstance();
		
		Integer nasc, idade;
		
		int maior =0, menor = 0;
		for(int i =1;i<=7;i++) {
			System.out.printf("Em que ano a %dª pessoa Nasceu: ", i);
			nasc = sc.nextInt();
			idade = cal.get(Calendar.YEAR) - nasc;
			if(idade>=18) {
				maior++;
			}else {
				menor++;
			}
		}
		
		System.out.printf("Ao todo tivemos %d pessoas maiores de idade\n",maior);
		System.out.printf("Ao todo tivemos %d pessoas menores de idade\n",menor);
		sc.close();
	}

}
