package co.edu.upb.calculadora1;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        int num;
        Calculadora calculadora = new Calculadora();
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Menu: ");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("5. Exponente");
            System.out.println("6. Raiz");
            System.out.println("7. Factorial");
            System.out.println("\nIngrese una opcion: ");
            num = scanner.nextInt();
        } while (num<1 && num>7);
 
        if (num == 1 || num == 2 || num == 3 || num == 4 || num == 5) {
            int a;
            int b;
            System.out.println("Ingrese dos numeros: ");
            Scanner scanner2 = new Scanner(System.in);
            a = scanner2.nextInt();
            Scanner scanner3 = new Scanner(System.in);
            b = scanner3.nextInt();
 
            switch (num) {
                case 1:
                    calculadora.suma(a, b);
                    break;
                case 2:
                    calculadora.resta(a, b);
                    break;
                case 3:
                    calculadora.multiplicacion(a, b);
                    break;
                case 4: 
                    calculadora.division(a, b);
                    break;
                case 5:
                    calculadora.exponente(a, b);
                    break;
            }
        } else {
            int a;
            System.out.println("Ingrese un numero: ");
            Scanner scanner4 = new Scanner(System.in);
            a = scanner4.nextInt();
            switch (num) {
                case 6:
                    calculadora.raiz(a);
                    break;
                case 7:
                    calculadora.factorial(a);
                    break;
        }
    }
}