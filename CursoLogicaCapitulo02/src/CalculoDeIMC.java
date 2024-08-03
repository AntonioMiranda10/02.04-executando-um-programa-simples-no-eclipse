import java.util.Scanner;

public class CalculoDeIMC {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o peso em KG: ");
		Double PesoEmKG = scanner.nextDouble(); 
		
		System.out.print("Digite  a altura em metro: ");
		Double AlturaEmMetro = scanner.nextDouble(); 
		
		System.out.print("O Resultado do Dobro da Altura é: ");
		Double ResultadoAlturaAltura = AlturaEmMetro*AlturaEmMetro;
		System.out.println(ResultadoAlturaAltura);
		
		Double Resultado = PesoEmKG / ResultadoAlturaAltura;
		
		System.out.println("O IMC é: " + Resultado);
			
	    scanner.close();
	}
	
	
	
	
}

