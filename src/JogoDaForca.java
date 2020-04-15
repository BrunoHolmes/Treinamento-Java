import java.util.Scanner;
public class JogoDaForca {
	public static void main(String[] args) {
		Scanner leTeclado = new Scanner(System.in);
		String[] forca = {"s", "p", "o", "r", "t"};
		
		int[] teste = new int[5];
		System.out.println("Jogo da forca. Voce tem tres tentativas. Digite a primeira:");
		String tentativa1 = leTeclado.next();
		
		for(int i = 0; i < 5; i++) {
			if(tentativa1.equalsIgnoreCase(forca[i])) {
				tentativa1 = forca[i];
				System.out.println("Acertou!");
				System.out.println(tentativa1);
			}else {
				System.out.println("Errou, tem mais 2 tentativas");
				continue;
			}
			
			System.out.println("Segunda tentativa");
			String tentativa2 = leTeclado.next();
			
			if(tentativa2.equalsIgnoreCase(forca[i])) {
				tentativa1 = forca[i];
				System.out.println("Acertou!");
				System.out.println(tentativa2);
			}else {
				System.out.println("Errou, tem mais 1 tentativa");
				continue;
			}
			
			System.out.println("Digite a terceira tentativa");
			String tentativa3 = leTeclado.next();
			
			if(tentativa3.equalsIgnoreCase(forca[i])) {
				tentativa1 = forca[i];
				System.out.println("Acertou!");
				System.out.println(tentativa3);
			}else {
				System.out.println("Perdeu, tente novamente");
				break;
			}
			
		}
	}
}
