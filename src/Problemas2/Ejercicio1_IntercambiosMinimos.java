package Problemas2;

import java.util.Scanner;

public class Ejercicio1_IntercambiosMinimos {

    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);

        int A = Scanner.nextInt();
        int B = Scanner.nextInt();
        int C = Scanner.nextInt();

        if (A > B && C > B && C > A) {
            System.out.println("" + 1);
        } else if (A < B && C < B && C < A) {
            System.out.println("" + 2);
        } else if (A > B && C < B && C < A) {
            System.out.println("" + 1);
        } else if (A > B && C > B && C < A) {
            System.out.println("" + 2);
        } else if (A < B && C < B && C > A) {
            System.out.println("" + 1);
        } else {
            System.out.println("" + 0 );
        }
    }
}

/*
OTRA FORMA DE REALIZARLO

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        int[] arr = {A, B, C};
        
        int swaps = 0;
        boolean swapped;
        
        do {
            swapped = false;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i - 1] > arr[i]) {
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                    swaps++;
                }
            }
        } while (swapped);
        
        System.out.println(swaps);
    }
}
*/