package controller;

import java.util.ArrayList;

import models.Circulo;
import models.Forma;
import models.Retangulo;
import models.Triangulo;

public class FormaController {

	private static ArrayList<Forma> formas = new ArrayList<Forma>(); 

	public static ArrayList<Forma> listar() {
		return formas;
	}
	
	public static void cadastrar(Forma forma) {
		
		formas.add(forma);
	}

	public static ArrayList<Retangulo> listarRetangulos() {
		
		ArrayList<Retangulo> retangulos = new ArrayList<Retangulo>();
		
		for (Forma formaCadastrada : formas) {
			if(formaCadastrada instanceof Retangulo) 
				retangulos.add((Retangulo) formaCadastrada);
		}
		
		return retangulos; 
	}
	
	public static ArrayList<Triangulo> listarTriangulos() {
		
		ArrayList<Triangulo> triangulos = new ArrayList<Triangulo>();
		
		for (Forma formaCadastrada : formas) {
			if(formaCadastrada instanceof Triangulo) 
				triangulos.add((Triangulo) formaCadastrada);
		}
		
		return triangulos; 
	}
	
	public static ArrayList<Circulo> listarCirculos() {
		
		ArrayList<Circulo> circulos = new ArrayList<Circulo>();
		
		for (Forma formaCadastrada : formas) {
			if(formaCadastrada instanceof Circulo) 
				circulos.add((Circulo) formaCadastrada);
		}
		
		return circulos; 
	}
}
