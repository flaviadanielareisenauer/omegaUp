package Problemas3;

import java.util.Scanner;

public class ejercicio9_unProcesoIterativoSencillo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        if (n < 1) {
            System.out.println("Por favor, ingrese un valor de N mayor o igual a 1.");
        } else {
            while (n < 100) {
                if (n % 2 == 0) {
                    n += 3;
                } else {
                    n *= 2;
                }
            }

            System.out.println(n);
        }

        scanner.close();
    }
}
