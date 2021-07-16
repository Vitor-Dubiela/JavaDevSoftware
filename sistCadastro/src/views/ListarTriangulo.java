package views;

import java.util.ArrayList;

import controller.FormaController;
import models.Triangulo;

public class ListarTriangulo {

	private static ArrayList<Triangulo> triangulos = FormaController.listarTriangulos();
	
	public static void renderizar() {

		System.out.println("\n===========================================\n");
		System.out.println("-- LISTAR TRIÂNGULOS--\n");
		for (Triangulo triangCadastrado : triangulos) {
				System.out.println(triangCadastrado);
		}
	}

}
