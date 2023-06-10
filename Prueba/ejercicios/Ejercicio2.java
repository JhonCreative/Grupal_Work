package ejercicios;
// check
import java.util.Scanner;

public class Ejercicio2 {
    public static void ejecutar(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de términos a mostrar: ");
        int n = scan.nextInt();        
        int[] serie = {1, 2, 3, 4, 5, 2};
        int i = 0;
        int count = 0;
        
        while (count < n) {
            System.out.print(serie[i] + " ");
            count++;
            i = (i + 1) % serie.length;
        }
    }
}