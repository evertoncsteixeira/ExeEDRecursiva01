import java.util.Scanner;

public class Principal { 
	public static int total = 0;
	public static void main(String[] args) {
		int numero  = 200501;
		int repetidor  = -1;
 
		Scanner num = new Scanner(System.in);
		while (numero <= 9 || numero > 999999) {
			System.out.printf("Informe um n�mero para a fun��o recursiva:\n");
			numero = num.nextInt();
		}
		
		while (repetidor < 0 || repetidor > 9) {
			System.out.printf("Informe um n�mero para repeti��o na fun��o recursiva:\n");
			repetidor = num.nextInt();
		}

		System.out.println("O n�mero " +  repetidor + " se repete " + funcaoNumeroRepete(numero,repetidor) + " no numero " + numero);
	}
	
	public static int funcaoNumeroRepete(int numero, int repetidor) {
		String valor = "" + numero;
		//Usado o numero de caracteres do numero principal como pausa, quando ele chegar a 1 caracter a fun��o faz o retorno.
		if (valor.length() <= 1) {
			if (Integer.parseInt(valor.substring(valor.length()-1,valor.length())) == repetidor) {
				total += 1;
			} 
		} else {
			if (Integer.parseInt(valor.substring(valor.length()-1,valor.length())) == repetidor) {
				total += 1 +  funcaoNumeroRepete(Integer.parseInt(valor.substring(0,valor.length()-1)) ,repetidor);
			} else {
				funcaoNumeroRepete(Integer.parseInt(valor.substring(0,valor.length()-1)) ,repetidor);
			}
		}

		return total;
	}
}
