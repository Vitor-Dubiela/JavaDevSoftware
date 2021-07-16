package views;

import utils.Console;

public class Principal {

	public static void main(String[] args) {		
		int opcao;		
		
		do {
			System.out.println("\n===========================================\n");
			System.out.println("1 - Cadastrar Ret�ngulo");
			System.out.println("2 - Cadastrar Tri�ngulo");
			System.out.println("3 - Cadastrar C�rculo");
			System.out.println("4 - Listar todos");
			System.out.println("5 - Listar Ret�ngulo");
			System.out.println("6 - Listar Tri�ngulo");
			System.out.println("7 - Listar C�rculo");
			System.out.println("0 - Sair\n");
			opcao = Console.lerInteiro("Digite a op��o desejada: ");
			switch (opcao) {
			case 1:
				CadastrarRetangulo.renderizar();
				break;
			case 2:
				CadastrarTriangulo.renderizar();
				break;
			case 3:	
				CadastrarCirculo.renderizar();
				break;
			case 4:	
				ListarTodos.renderizar();
				break;
			case 5:	
				ListarRetangulo.renderizar();
				break;
			case 6:	
				ListarTriangulo.renderizar();
				break;	
			case 7:		
				ListarCirculo.renderizar();
				break;
			case 0:
				System.out.println("\nSaindo...");
				break;
			default:
				System.out.println("\nOp��o inv�lida!");
				break;
			}			
		} while (opcao != 0);
	}
}