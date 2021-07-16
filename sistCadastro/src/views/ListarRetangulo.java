package views;

import java.util.ArrayList;

import controller.FormaController;
import models.Retangulo;

public class ListarRetangulo {

	private static ArrayList<Retangulo> retangulos = FormaController.listarRetangulos();
	
	public static void renderizar() {

		System.out.println("\n===========================================\n");
		System.out.println("-- LISTAR RETÂNGULOS --\n");
		for (Retangulo retangCadastrado : retangulos) {
				System.out.println(retangCadastrado);
		}
	}

}
