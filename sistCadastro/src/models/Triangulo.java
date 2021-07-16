package models;

public class Triangulo extends Forma{

	private int altura;
	private int base;
	
	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		double area;
		area = (this.base * this.altura) / 2;
		
		return area;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Triângulo, área: " + this.calcularArea() + "\n";
	}
}
