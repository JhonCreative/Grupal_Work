package ejercicios;
import java.util.Scanner;
public class Ejercicio11 {
    public static void ejecutar(){
        int[] numeros = new int[10];
        int con1 = 0;
        int con2 = 0;
        Scanner var = new Scanner(System.in);
        System.out.println("Ingrese 10 números enteros:");

        for (int i = 0; i < 10; i++) {
            numeros[i] = var.nextInt();
            if (numeros[i] % 3 == 0) {
                con1++;
            }
            if (numeros[i] % 5 == 0) {
                con2++;
            }
        }

        System.out.println("Cantidad de múltiplos de 3: " + con1);
        System.out.println("Cantidad de múltiplos de 5: " + con2);
    }
}
