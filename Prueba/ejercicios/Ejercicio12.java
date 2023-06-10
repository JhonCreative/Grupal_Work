package ejercicios;
// check
import java.util.Scanner;
public class Ejercicio12 {
    public static void ejecutar(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números a promediar: ");
        int num = scan.nextInt();
        int sum = 0;
        int mayores = 0;
        int menores = 0;
        int array[] = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.print("Ingrese el "+(i+1)+"° número: ");
            array[i] = scan.nextInt();
            sum = sum + array[i];
        }
        int prom = sum/num;
        System.out.println("Array:");
        for (int i = 0; i < num; i++) {
            System.out.print(array[i]+"\t");
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i]<=prom) {
                menores+=1;
            } else {
                mayores+=1;
            }
        }
        System.out.println("\nEl promedio de "+num+" números es: " + prom);
        System.out.println("Hay "+mayores+" elementos mayores al promedio en el arreglo");
        System.out.println("Hay "+menores+" elementos menores al promedio en el arreglo");
    }
}
