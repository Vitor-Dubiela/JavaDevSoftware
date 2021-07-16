package views;

import java.util.Scanner;

import controller.FormaController;
import models.Triangulo;
import utils.Console;

public class CadastrarTriangulo {

	public static void renderizar() {
		
		Scanner sc = new Scanner(System.in);
		Triangulo triang = new Triangulo();
		int valor;
		
		System.out.println("\n===========================================\n");
		System.out.println("-- CADASTRAR TRIÂNGULO --\n");
		valor = Console.lerInteiro("Digite o valor da altura: ");
		triang.setAltura(valor);
		
		valor = Console.lerInteiro("Digite o valor da base: ");
		triang.setBase(valor);
		
		FormaController.cadastrar(triang);
	}

}
