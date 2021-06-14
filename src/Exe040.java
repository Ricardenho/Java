import java.util.Scanner;

/*Elabore um programa que calcule o valor a ser pago por um produto, considerando o seu pre�o normal e condi��o de pagamento:
- � vista dinheiro/cheque: 10% de desconto
- � vista no cart�o: 5% de desconto
- em at� 2x no cart�o: pre�o formal
- 3x ou mais no cart�o: 20% de juros*/
public class Exe040 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double preco = sc.nextDouble();
		System.out.println("[1] Dinheiro com 10% de DESCONTO");
		System.out.println("[2] � vista Cart�o com 5% de DESCONTO");
		System.out.println("[3] 2x Cart�o");
		System.out.println("[4] 3x Ou mais no Cart�o com JUROS de 20%");
		
		Integer esc = sc.nextInt();
		
		if(esc == 1) {
			System.out.printf("Valor: R$ %.2f\nTOTAL: R$ %.2f", preco, preco-preco*0.1);
		}else if(esc == 2) {
			System.out.printf("Valor: R$ %.2f\nTOTAL: R$ %.2f", preco, preco-preco*0.05);
		}else if(esc == 3) {
			System.out.printf("Valor: R$ %.2f\n2 parcelas de R$ %.2f", preco, preco/2);
		}else {
			System.out.println("Numero de parcelas: ");
			Integer parcelas = sc.nextInt();
			
			System.out.printf("Sua compra ser� parcelada em %d x de R$ %.2f com Juros\n", parcelas, (preco*1.2)/parcelas);
			System.out.printf("Sua Compra de R$ %.2f vai custar R$ %.2f no Final", preco, preco*1.2);
		}
		
		sc.close();

	}

}
