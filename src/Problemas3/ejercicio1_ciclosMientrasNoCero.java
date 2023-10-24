package Problemas3;

import java.util.Scanner;

public class ejercicio1_ciclosMientrasNoCero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int suma = 0;

        while (true) {
            numero = scanner.nextInt();

            if (numero == 0) {
                break;
            }

            suma += numero;
        }

        System.out.println(suma);

        scanner.close();
    }
}
