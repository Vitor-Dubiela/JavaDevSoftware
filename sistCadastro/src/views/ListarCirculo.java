package views;

import java.util.ArrayList;

import controller.FormaController;
import models.Circulo;

public class ListarCirculo {

	private static ArrayList<Circulo> circulos = FormaController.listarCirculos();
	
	public static void renderizar() {
		
		System.out.println("\n===========================================\n");
		System.out.println("-- LISTAR CÍRCULOS --\n");
		for (Circulo circCadastrado : circulos) {
				System.out.println(circCadastrado);
		}
	}

}
