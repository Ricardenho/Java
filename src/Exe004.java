import java.util.Locale;

//Faça um programa que leia algo pelo teclado e mostre na tela o seu tipo primitivo

public class Exe004 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		System.out.println("str" instanceof String);  // true 

		Integer a  = 12 ;
		System.out.println(a instanceof Integer);

	}

}
