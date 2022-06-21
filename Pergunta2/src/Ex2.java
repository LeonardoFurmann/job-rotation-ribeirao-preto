import java.util.Arrays;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int num = leitor.nextInt();
	
		boolean contem;
		
		int[] fibonacci = new int[num + 2];
		fibonacci[0] = 0;
		fibonacci[1] = 1;
		
		for(int i = 2; i < fibonacci.length ; i++) {
			fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
			
		}


		// Imprime a sequência
		System.out.println();
		System.out.println(Arrays.toString(fibonacci));
	
		// Verifica o número
		System.out.println();
		contem = Arrays.toString(fibonacci).contains(Integer.toString(num));
		System.out.printf(contem ? "O Número %d pertence a sequência." : "O Número %d não pertence a sequência.", num);
		
		leitor.close();
		

	}

}
