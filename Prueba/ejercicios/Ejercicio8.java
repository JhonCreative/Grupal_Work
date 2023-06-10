package ejercicios;
import java.util.Scanner;

public class Ejercicio8 {
    public static void ejecutar(){
        String[] vector = new String[5];
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese un elemento para el vector: ");
            vector[i] = leer.nextLine();
        }

        System.out.println("Vector original:");
        for (String elemento : vector) {
            System.out.print(elemento + " ");
        }

        System.out.println();

        String[] vectorInverso = new String[5];
        for (int i = 0; i < 5; i++) {
            vectorInverso[i] = vector[4 - i];
        }

        System.out.println("Vector inverso:");
        for (String elemento : vectorInverso) {
            System.out.print(elemento + " ");
        }
    }
}
