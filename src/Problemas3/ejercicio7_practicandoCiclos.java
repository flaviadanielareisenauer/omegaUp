package Problemas3;

import java.util.Scanner;

public class ejercicio7_practicandoCiclos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        while (N < 1000) {
            if (N % 2 == 0) {
                N += sumarEnteros(1, A);
            } else {
                N += sumarEnteros(1, B);
            }
        }

        System.out.println(N);

        scanner.close();
    }

    private static int sumarEnteros(int inicio, int fin) {
        int suma = 0;
        for (int i = inicio; i <= fin; i++) {
            suma += i;
        }
        return suma;
    }
}
