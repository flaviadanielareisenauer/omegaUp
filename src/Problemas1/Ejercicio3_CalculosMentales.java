package Problemas1;

import java.util.Scanner;

public class Ejercicio3_CalculosMentales {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double R = scanner.nextDouble();

        double resultado1 = R + 5;
        double resultado2 = Math.pow(resultado1, 2);
        double resultado3 = resultado2 / (R / 3);
        double resultado4 = Math.pow(resultado3, 3);

        System.out.printf("%.2f %.2f %.2f %.2f %.2f%n", R, resultado1, resultado2, resultado3, resultado4);

        scanner.close();
    }
}
