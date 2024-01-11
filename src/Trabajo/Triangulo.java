package Trabajo;

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Pedir los lados del triángulo
        System.out.print("Ingrese la longitud del base: ");
        int base = scanner.nextInt();

        System.out.print("Ingrese la longitud del altura: ");
        int altura = scanner.nextInt();

        // Calcular el área del triángulo
        double area = AreaTriangulo(base, altura);

        // Mostrar el resultado
        System.out.println("El área del triángulo es: " + area);
        
      //área y perímetro del círculo
        System.out.println("Introduce el radio: ");
      	int radio = scanner.nextInt();
      	System.out.println("el area de la circunferencia es: "+calaACirc(radio));
    	System.out.println("el perimetro de la circunferencia es : "+perimetroACirc(radio));
      		
      	//area de cilíndro
      	System.out.println("Introduce la altura para el cilindro: ");
        int alturaCil = scanner.nextInt();
      	System.out.println("Introduce la radio para el cilindro: ");
        int radioCil = scanner.nextInt();
        System.out.println("El área del cilindro es: " + areaCilindro(alturaCil, radioCil));
      //área del rectángulo
  		System.out.println("introduce el lado 1 del rectangulo");
  		int lado1rec=scanner.nextInt();
  		System.out.println("introduce el lado 2 del rectangulo");
  		int lado2rec=scanner.nextInt();
  		System.out.println("El área del rectángulo es: " + areaRectangulo(lado1rec, lado2rec));
  	// calcular el volumen de un cubo
        System.out.println("introduce un lado del cubo");
        int ladocubo=scanner.nextInt();
        System.out.println("el volumen del cubo es: "+volumenCubo(ladocubo));
}
	public static double AreaTriangulo(int base, int altura) {
		double area=((base*altura)/2);
		return area;
	}
	//Alumno 2 calcula el área y el perímetro del círculo
	public static double calaACirc(int radio) {
		double area = 3.14*(radio^2);
		return area;
	}
	public static double perimetroACirc(int radio) {
		double perimetro=2*(3.14*radio);
		return perimetro;
	}
	public static double areaCilindro(int alturaCil, int radioCil) {
		return 2*3.14* alturaCil + 2*3.14* radioCil;
	}
	public static double areaRectangulo(int lado1rec,int lado2rec) {
		return ((lado1rec*2) + (lado2rec*2));
	}
	 public static double volumenCubo(int ladocubo) {
	        double volumen=ladocubo*ladocubo*ladocubo;
	        return volumen;
	}
	
}
