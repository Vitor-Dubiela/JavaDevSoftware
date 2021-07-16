package views;

import java.util.Scanner;

import controller.FormaController;
import models.Circulo;
import utils.Console;

public class CadastrarCirculo {

	public static void renderizar() {

		Scanner sc = new Scanner(System.in);
		Circulo circ = new Circulo();
		int valor;
		
		System.out.println("\n===========================================\n");
		System.out.println("-- CADASTRAR CIRCULO --\n");
		valor = Console.lerInteiro("Digite o valor do raio: ");
		circ.setRaio(valor);
		
		FormaController.cadastrar(circ);
	}

}
