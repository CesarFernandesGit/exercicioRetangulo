import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double base, altura, area, perimetro, diagonal;
		
		System.out.print("Base do retângulo: ");
		base = sc.nextDouble();
		System.out.print("Altura do retângulo: ");
		altura = sc.nextDouble();
		
		area = (base * altura);
		perimetro = 2 * (base + altura);
		diagonal = Math.sqrt(base * base + altura * altura);
		
		System.out.printf("A área do retângulo é de %.4f%n", area);
		System.out.printf("O perímetro do retângulo é de %.4f%n", perimetro);
		System.out.printf("O diagonal do retângulo é de %.4f%n", diagonal);
		
		sc.close();
		
	}

}
