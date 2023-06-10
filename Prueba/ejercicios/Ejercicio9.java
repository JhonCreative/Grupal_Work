package ejercicios;
// check
import java.util.Scanner;
public class Ejercicio9 {
    public static void ejecutar(){
        Scanner scan = new Scanner(System.in);
        System.out.println("------------------------------------------\n\tVector de 10 elementos\n------------------------------------------");
        int array[] = new int[10];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Ingrese el "+(i+1)+"° numero -> ");
            array[i] = scan.nextInt();
            if (array[i] < 0) {
                break;
            }
        }
        System.out.println("\n-------------------------------------------------------------");
        for (int i = 0; i < array.length; i++) {
            System.out.print("  "+array[i]+"  |");
        }
        System.out.println("\n-------------------------------------------------------------");
    }
}
