//Faça um programa que calcule a soma entre todos os números que são múltiplos de três e ímpares e que se encontram no intervalo de 1 até 500.

public class Exe044 {

	public static void main(String[] args) {
		int total = 0;
		int qtd = 0;
		for(int i=0; i<=500;i++) {
			if (i%3 == 0 && i%2==1) {
				total+=i;
				qtd++;
			}
		}
		
		System.out.printf("A soma de todos os %d valores solicitados é %d", qtd, total);
	}

}
