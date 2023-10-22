package Problemas1;
import java.util.Scanner;

public class Ejercicio4_LaHoraEnUnPlanetaLejano {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el número de segundos (S): ");
        int S = scanner.nextInt();
        
        // Calcular días, horas, minutos y segundos
        int dias = S / (12 * 70 * 50); // Días en un planeta extraño
        S %= (12 * 70 * 50); // Restante después de restar los días
        
        int horas = S / (70 * 50); // Horas en un día
        S %= (70 * 50); // Restante después de restar las horas
        
        int minutos = S / 50; // Minutos en una hora
        int segundos = S % 50;
        
        System.out.println("Días: " + dias);
        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);
        System.out.println("Segundos: " + segundos);
    }
}