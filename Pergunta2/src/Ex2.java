import java.util.Arrays;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite um n�mero: ");
		int num = leitor.nextInt();
	
		boolean contem;
		
		int[] fibonacci = new int[num + 2];
		fibonacci[0] = 0;
		fibonacci[1] = 1;
		
		for(int i = 2; i < fibonacci.length ; i++) {
			fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
			
		}


		// Imprime a sequ�ncia
		System.out.println();
		System.out.println(Arrays.toString(fibonacci));
	
		// Verifica o n�mero
		System.out.println();
		contem = Arrays.toString(fibonacci).contains(Integer.toString(num));
		System.out.printf(contem ? "O N�mero %d pertence a sequ�ncia." : "O N�mero %d n�o pertence a sequ�ncia.", num);
		
		leitor.close();
		

	}

}
