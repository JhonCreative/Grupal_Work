package ejercicios;
import java.util.Scanner;

public class Ejercicio5 {
    public static void ejecutar() {
        Scanner leer = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Ingrese el primer número -> ");
        a = leer.nextInt();
        System.out.println("Ingrese el primer número -> ");
        b = leer.nextInt();
        if (a%b==0){
            System.out.println(a+" es multiplo de "+b);
        }else if(b%a==0){
            System.out.println(b+" es multiplo de "+a);
        }else{
            System.out.println("Ni "+ a + " ni "+b+"son multiplos del otro");
        }
    }
}
