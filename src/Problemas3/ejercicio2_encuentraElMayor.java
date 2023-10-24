package Problemas3;

import java.util.Scanner;

public class ejercicio2_encuentraElMayor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Por favor, ingrese un valor válido para N.");
            return;
        }

        int mayor = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int numero = scanner.nextInt();

            if (numero > mayor) {
                mayor = numero;
            }
        }

        System.out.println(mayor);

        scanner.close();
    }
}
