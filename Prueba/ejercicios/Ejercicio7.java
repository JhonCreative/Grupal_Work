package ejercicios;
// check
import java.util.Scanner;
public class Ejercicio7 {
    public static void ejecutar(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese el primer número  -> ");
        int numero1 = scan.nextInt();
        System.out.print("Ingrese el segundo número -> ");
        int numero2 = scan.nextInt();
        int mcd = calcularMCD(numero1, numero2);
        System.out.println("El MCD de " + numero1 + " y " + numero2 + " es: " + mcd);
    }
    public static int calcularMCD(int numero1, int numero2) {
        while (numero2 != 0) {
            int temp = numero2;
            numero2 = numero1 % numero2;
            numero1 = temp;
        }
        return numero1;
    }
}
