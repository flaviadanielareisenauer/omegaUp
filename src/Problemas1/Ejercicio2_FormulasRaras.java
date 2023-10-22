package Problemas1;

import java.util.Scanner;

public class Ejercicio2_FormulasRaras {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double z = scanner.nextDouble();

        double resultado = (x + x * (y + z * z)) / ((x + Math.PI) * (y + Math.PI));

        System.out.println(resultado);

        scanner.close();
    }
}