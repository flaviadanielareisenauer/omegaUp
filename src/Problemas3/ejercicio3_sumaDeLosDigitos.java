package Problemas3;

import java.util.Scanner;

public class ejercicio3_sumaDeLosDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Por favor, ingrese un entero positivo.");
        } else {
            int suma = sumaDigitos(n);
            System.out.println(suma);
        }

        scanner.close();
    }

    public static int sumaDigitos(int numero) {
        if (numero < 10) {
            return numero;
        } else {
            return numero % 10 + sumaDigitos(numero / 10);
        }
    }
}
