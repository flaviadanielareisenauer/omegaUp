package Problemas3;

import java.util.Scanner;

public class ejercicio4_sumaDePrimos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (!esPrimo(n)) {
            int[] primos = encontrarSumaDosPrimos(n);
            System.out.println(primos[0] + " " + primos[1]);
        } else {
            System.out.println(n + " 0");
        }

        scanner.close();
    }

    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int[] encontrarSumaDosPrimos(int n) {
        int[] primos = new int[2];
        for (int i = 2; i <= n / 2; i++) {
            if (esPrimo(i) && esPrimo(n - i)) {
                primos[0] = Math.max(i, n - i);
                primos[1] = Math.min(i, n - i);
                break;
            }
        }
        return primos;
    }
}
