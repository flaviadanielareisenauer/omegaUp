package Problemas3;

import java.util.Scanner;

public class ejercicio6_practicandoCiclos2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        while (N < 100) {
            for (int i = 1; i <= N; i++) {
                System.out.print(i + " ");
            }

            for (int i = N; i >= 1; i--) {
                System.out.print(i + " ");
            }

            int T = A * N;

            while (N < T) {
                N += B;
            }

            System.out.println();
        }

        scanner.close();
    }
}
