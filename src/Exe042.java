//Fa�a um programa que mostre na tela uma contagem regressiva para o estouro de fogos de artif�cio,
//indo de 10 at� 0, com uma pausa de 1 segundo entre eles.
public class Exe042 {

	public static void main(String[] args) throws InterruptedException {
		for(int i=10;i>=0;i--) {
			System.out.println(i);
			Thread.sleep(1000);
	}

}
	
}
