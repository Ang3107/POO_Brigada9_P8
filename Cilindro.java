
package ejer4;

public class Cilindro extends Circulo{
	private double altura;

	public Cilindro(){}

	public Cilindro(int x, int y, double radio, double valorAltura){
		super(x, y, radio);
		establecerAltura(valorAltura);
	}
	public void establecerAltura(double valorAltura){
		altura = valorAltura < 0.0 ? 0.0 : valorAltura;
	}
	public double obtenerAltura(){
		return altura;
	}
	public double obtenerArea(){
		return ((2.0 * Math.PI * super.obtenerRadio() * altura) + (super.obtenerArea()));
	} 
	public double obtenerVolumen(){
		return (Math.PI * (super.obtenerRadio())*(super.obtenerRadio()) * altura);
	}
	public String obtenerNombre(){
		return "Cilindro";
	}
	public String toString(){
                return super.toString() + ", Altura = " + altura;
	}
}







