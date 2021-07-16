package views;

import utils.Console;

public class Principal {

	public static void main(String[] args) {		
		int opcao;		
		
		do {
			System.out.println("\n===========================================\n");
			System.out.println("1 - Cadastrar Retângulo");
			System.out.println("2 - Cadastrar Triângulo");
			System.out.println("3 - Cadastrar Círculo");
			System.out.println("4 - Listar todos");
			System.out.println("5 - Listar Retângulo");
			System.out.println("6 - Listar Triângulo");
			System.out.println("7 - Listar Círculo");
			System.out.println("0 - Sair\n");
			opcao = Console.lerInteiro("Digite a opção desejada: ");
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
				System.out.println("\nOpção inválida!");
				break;
			}			
		} while (opcao != 0);
	}
}