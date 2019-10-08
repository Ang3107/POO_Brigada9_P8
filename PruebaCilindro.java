package ejer2;
import java.text.DecimalFormat;

public class PruebaCilindro{
        public static void main(String [] args){
		Cilindro c1 = new Cilindro(30, 20, 2.5, 3.4);
		System.out.println("Se crea un objeto de la clase Cilindro con las siguientes caracteristicas: ");
		System.out.println("La coordenada en X es:    " + c1.getX());
		System.out.println("La coordenada en Y es     " + c1.getY());
                System.out.println("El radio es:              " + c1.getRadio());
		System.out.println("La altura del cilindo es: " + c1.getaltura()); 
		DecimalFormat dosDigitos = new DecimalFormat ("0.00");
		System.out.println("El area del cilindo es:   " + dosDigitos.format(c1.getArea()));


                c1.setX(35);
                c1.setY(20);
                c1.setRadio(4.25);
		c1.setaltura(5.25); 
		System.out.println("Se actualizan los datos y se tiene que el objeto tendra las siguientes caracteristicas: ");
		System.out.println("La coordenada en X es:    " + c1.getX());
                System.out.println("La coordenada en Y es     " + c1.getY());
                System.out.println("El radio es:              " + c1.getRadio());
                System.out.println("La altura del cilindo es: " + c1.getaltura());
                System.out.println("El area del cilindo es:   " + dosDigitos.format(c1.getArea()));

}
}



