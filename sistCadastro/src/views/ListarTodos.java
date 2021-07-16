package views;

import java.util.ArrayList;

import controller.FormaController;
import models.Circulo;
import models.Forma;
import models.Retangulo;
import models.Triangulo;

public class ListarTodos {

	private static ArrayList<Forma> formas = FormaController.listar();
	
	public static void renderizar() {
		
		System.out.println("\n===========================================\n");
		System.out.println("-- LISTAR TODOS --\n");
		for (Forma formaCadastrada : formas) {
			if(formaCadastrada instanceof Retangulo) 
				System.out.println(formaCadastrada);
			
			if(formaCadastrada instanceof Circulo) 
				System.out.println(formaCadastrada);
			
			if(formaCadastrada instanceof Triangulo) 
				System.out.println(formaCadastrada);
		}
	}

}
