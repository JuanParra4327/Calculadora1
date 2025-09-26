package Calculadora1;
import java.util.Scanner;
import java.math;
public class Calculadora{
    
    public double exponente (double a, double b) {
		double resultado = 1;
		for (int i = 0; i < b; i++) {
			resultado *= a;
		}
		System.out.println("El resultado es: " + resultado);
		return resultado;
	}
	
	public double raiz (double a) {
		double resultado = 0.0;
		if (a < 0) {
			System.out.println("Ingrese números positivos");
		} else {
			resultado = Math.sqrt(a);
		}
		System.out.println("El resultado es: " + resultado);
		return resultado;
	}

    public double factorial (double a){
        double resultado = 1;
		for (int i = 1; i < a+1; i++) {
			resultado *= i;
		} 
		System.out.println("El resultado es: " + resultado);
        return resultado;
    }

	public double resta (double a, double b){
		double resultado = 0.0;

		resultado = a - b;
		System.out.println("El resultado es: " + resultado);
		return resultado;
	}

	public double multiplicacion (double a, double b){
		double resultado = 0.0;

		resultado = a*b;
		System.out.println("El resultado es: " + resultado);
		return resultado;
	}

	public double suma (double a, double b){
		double resultado = 0.0;

		resultado = a + b;
		System.out.println("El resultado es: "+ resultado);
		return resultado;
	}

	public double division (double a, double b){
		double resultado = 0.0;

		if(b == 0){
			System.out.println("No es posible dividir entre 0");
		}else{
			resultado = a / b;
			System.out.println("El resultado es: "+ resultado);
		}
		return resultado;
	}
}