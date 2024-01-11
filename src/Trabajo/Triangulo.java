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
	}
	public static double AreaTriangulo(int base, int altura) {
		double area=((base*altura)/2);
		return area;
	}
}
