package Problemas3;

import java.util.Scanner;

public class ejercicio10_sumandoTerminosDeUnaSeriePeriodica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int ciclosCompletos = N / 3;
        int sumaCiclosCompletos = ciclosCompletos * (1 + 2 + 3);

        int terminosRestantes = N % 3;
        int sumaRestantes = 0;
        for (int i = 1; i <= terminosRestantes; i++) {
            sumaRestantes += i;
        }

        int sumaTotal = sumaCiclosCompletos + sumaRestantes;
        System.out.println(  sumaTotal);
    }
}
