package Problemas3;

import java.util.Scanner;

public class ejercicio5_laSecuenciaInfinita {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        imprimirSecuencia(N);
    }

    private static void imprimirSecuencia(int N) {
        int numeroActual = 1;
        boolean incrementando = true;

        for (int i = 0; i < N; i++) {
            System.out.print(numeroActual + " ");

            if (incrementando) {
                numeroActual++;
            } else {
                numeroActual--;
            }

            if (numeroActual == 5) {
                incrementando = false;
            } else if (numeroActual == 1) {
                incrementando = true;
            }
        }
    }
}
