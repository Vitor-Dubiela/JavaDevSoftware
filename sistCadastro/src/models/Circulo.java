package models;

public class Circulo extends Forma{

	private int raio;
	
	public int getRaio() {
		return raio;
	}

	public void setRaio(int raio) {
		this.raio = raio;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		double area;
		area = 3.14 * (this.raio * this.raio);
		
		return area;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Círculo, área: " + this.calcularArea() + "\n";
	}
}
