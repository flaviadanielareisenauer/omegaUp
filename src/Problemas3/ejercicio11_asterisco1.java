package Problemas3;

import java.util.Scanner;

public class ejercicio11_asterisco1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int M = scanner.nextInt();

        if (N < 1 || N > 100 || M < 1 || M > 100) {
            System.out.println("Los valores de N y M deben estar en el rango 1-100.");
            return;
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
