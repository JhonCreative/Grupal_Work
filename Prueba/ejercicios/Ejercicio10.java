package ejercicios;
// check
import java.util.Scanner;
public class Ejercicio10 {
    public static void ejecutar(){
        Scanner sc = new Scanner(System.in);
        
        double[] notas = new double[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese la nota del alumno " + (i+1) + ": ");
            notas[i] = sc.nextDouble();
        }
        
        int mayoresIgual51 = 0;
        int menores51 = 0;
        
        for (int i = 0; i < 10; i++) {
            if (notas[i] >= 51) {
                mayoresIgual51++;
            } else {
                menores51++;
            }
        }
        
        System.out.println("Cantidad de alumnos con notas mayores o iguales a 51: " + mayoresIgual51);
        System.out.println("Cantidad de alumnos con notas menores a 51: " + menores51);
    }
}
