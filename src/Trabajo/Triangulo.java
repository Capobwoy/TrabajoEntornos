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
      		int radio = scanner.nextInt();
      		System.out.println("el area de la circunferencia es: "+calaACirc(radio));
      		System.out.println("el perimetro de la circunferencia es : "+perimetroACirc(radio));
	}
	public static double AreaTriangulo(int base, int altura) {
		double area=((base*altura)/2);
		return area;
	}
	//Alumno 2 calcula el área y el perímetro del círculo
	public static double calaACirc(int radio) {
	double area = 3.14*(radio^2);
	return area;
}public static double perimetroACirc(int radio) {
	double perimetro=2*(3.14*radio);
	return perimetro;

}
}
