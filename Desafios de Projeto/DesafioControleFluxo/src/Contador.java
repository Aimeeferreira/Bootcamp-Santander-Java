import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		// O sistema solicita dois números inteiros e imprime uma contagem entre eles.
		// Se o segundo número for menor ou igual ao primeiro, exibe um erro e pede uma nova entrada.

		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro:");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro:");
		int parametroDois = terminal.nextInt();

		boolean entradaValida = false;
		
		while(!entradaValida) {

			try {
				contar(parametroUm, parametroDois);
				entradaValida = true;
			
			}catch (ParametrosInvalidosException e) {
				System.out.println("O segundo parâmetro deve ser MAIOR que o primeiro!");
				System.out.println("Digite o segundo parâmetro novamente:");
				parametroDois = terminal.nextInt();
			}
		}
		
	}

	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if(parametroUm >= parametroDois){
			throw new ParametrosInvalidosException();
		}
		
		int contagem = parametroDois - parametroUm;

		for (int i = 1; i <= contagem; i++) {
			System.out.println("Imprimindo o número " + i);
		}
	}
}