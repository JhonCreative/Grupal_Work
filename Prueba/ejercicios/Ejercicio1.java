package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
    public static void ejecutar() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su altura ");
        int altura= leer.nextInt();
        if(altura <= 150 ) {
            System.out.println("Persona de altura Baja");
        }
        else if(altura >150 && altura <= 170){
            System.out.println("Persona de altura media");
        } else {
            System.out.println("Persona alta");
        }
    }
}
