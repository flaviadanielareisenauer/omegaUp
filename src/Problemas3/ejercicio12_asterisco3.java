package Problemas3;

import java.util.Scanner;

public class ejercicio12_asterisco3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n < 1 || n > 100) {
            System.out.println("Por favor, ingrese un valor en el rango permitido.");
        } else {
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j < n - i; j++) {
                    System.out.print(" "); 
                }

                for (int j = 0; j < 2 * i - 1; j++) {
                    System.out.print("*");
                }

                System.out.println(); 
            }
        }
        scanner.close();
    }
}
