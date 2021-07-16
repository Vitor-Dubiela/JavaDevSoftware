package models;

public class Retangulo extends Forma {

	private int altura;
	private int largura;
	
	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getLargura() {
		return largura;
	}

	public void setLargura(int largura) {
		this.largura = largura;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		double area; 
		
		area = this.altura * this.altura;
		return area;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Retângulo, área: " + this.calcularArea() + "\n";
	}

}
