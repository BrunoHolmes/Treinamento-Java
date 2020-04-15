import java.util.Scanner;
public class TreinoFormatadorString {
	public static void main(String[] args) {
		Scanner leTeclado = new Scanner(System.in);
		
		System.out.println("Digite uma frase:");
		String frase = leTeclado.next();
		
		// sport.clubdo,recife 
		
		String acumulador = "";
		String letraAnterior = "";
		
		for (int i = 0; i < frase.length(); i++) {
			
			char letraAtualChar = frase.charAt(i);
			String letraAtual = String.valueOf(letraAtualChar);
			
			if(letraAnterior.equalsIgnoreCase(".")) {
				letraAtual = letraAtual.toUpperCase();
			}
			
			if(letraAnterior.equalsIgnoreCase(",") || letraAnterior.equalsIgnoreCase(".")) {
				acumulador = setLetra(acumulador," ");
			}
			
			acumulador = setLetra(acumulador, letraAtual);
			letraAnterior = letraAtual;
			
		}
		// verificar se a letra anterior é um ponto e transformar a letraAtual em maiúscula
		// verificar se a letra anterior é virgula ou ponto e colocar espaço 
		// quebrar a linha a cada 3 caracteres
		
		System.out.println(acumulador);
	}
	
	private static String setLetra(String acumulador,String letra) {
		acumulador += letra;
		String acumuladorSemEnter = acumulador.replace(String.valueOf('\n'), "");
		
		if(acumuladorSemEnter.length() % 3 == 0 && acumulador.length() > 0) {
			acumulador += '\n';
		}
		
		return acumulador;
	}
}
