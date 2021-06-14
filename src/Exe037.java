import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/*A Confederação Nacional de Natação precisa de um programa que leia o ano de nascimento de um atleta,
 * e mostre sua categoria de acordo com a idade:
- Até 9 anos: MIRIM
- Até 14 anos: INFANTIL
- Até 19 anos: JÚNIOR
- Até 25 anos: SÊNIOR
- Acima de 25 anos: MASTER*/
public class Exe037 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calendar cal = GregorianCalendar.getInstance();
		
		Integer nasc, idade;
		nasc = sc.nextInt();
		idade = cal.get(Calendar.YEAR) - nasc;
		
		if(idade <= 9) {
			System.out.printf("ANOS: %d\nCategoria MIRIM", idade);
		}else if(idade > 9 && idade<=14) {
			System.out.printf("ANOS: %d\nCategoria INFANTIL", idade);
		}else if(idade > 14 && idade<=19) {
			System.out.printf("ANOS: %d\nCategoria JÚNIOR", idade);
		}else if(idade > 19 && idade<=25) {
			System.out.printf("ANOS: %d\nCategoria SÊNIOR", idade);
		}else {
			System.out.printf("ANOS: %d\nCategoria MASTER", idade);
		}
		
		
		
		
		sc.close();

	}

}
