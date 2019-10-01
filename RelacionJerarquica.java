public class RelacionJerarquica{
	public static void main (String[] args){
		Punto punto = new Punto (30,50);
		Circulo circulo = (Circulo) punto (120, 89, 2.7);

		System.out.println("Llamado a toString de Punto con referencia" + 
			"a la superclase apuntando al objeto de la superclase:\n" + punto.toString());

		System.out.println ("Lamado a toString de Circulo con refrencia" + 
			"a la sublcase apuntando al objeto de la subclase:\n"+ circulo.toString());

		Punto refPunto = circulo;
		System.out.println("Llamado a toString de Circulo con referencia"+
			"a la superclase apuntando al objeto de la sublcase:\n"+ refPunto.toString());
	}
}
