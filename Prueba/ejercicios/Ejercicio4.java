package ejercicios;
// check
import java.util.Scanner;
public class Ejercicio4 {
    public static void ejecutar(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de términos a mostrar: ");
        int n = scan.nextInt();        
        int i = 1;
        int count = 0;
        while (count < n) {
            for (int j = 0; j < i && count < n; j++) {
                System.out.print(i + " ");
                count++;
            }
            i++;
        }
    }
}