import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite uma palavra: ");
		String palavra = leitor.nextLine();
		
		char[] caracteres = palavra.toCharArray();
		
		System.out.print("Palavra invertida: ");
		
		for(int i = caracteres.length - 1; i>=0; i--) {
			System.out.print( caracteres[i]);
		}
		
		leitor.close();

	}

}
