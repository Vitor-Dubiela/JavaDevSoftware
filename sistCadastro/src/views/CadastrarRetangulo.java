package views;

import java.util.Scanner;

import controller.FormaController;
import models.Retangulo;
import utils.Console;

public class CadastrarRetangulo {

	public static void renderizar() {
		
		Scanner sc = new Scanner(System.in);
		Retangulo retang = new Retangulo();
		int valor;
		
		System.out.println("\n===========================================\n");
		System.out.println("-- CADASTRAR RETÂNGULO --\n");
		valor = Console.lerInteiro("Digite o valor da altura: ");
		retang.setAltura(valor);
		
		valor = Console.lerInteiro("Digite o valor da largura: ");
		retang.setLargura(valor);
		
		FormaController.cadastrar(retang);
	}
}
