import java.util.Scanner;

public class Exercicio02IMCrefined {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o seu Peso: ");
		Double Peso = scanner.nextDouble();
		
		System.out.print("Digite a sua Altura: ");
		Double Altura = scanner.nextDouble();
		
		Double IMC = Peso / (Altura*Altura);
		
		System.out.println("Resultado do IMC é: " + IMC);
		
		scanner.close();
		
	}

	
	
}
