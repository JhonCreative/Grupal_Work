package ejercicios;
import java.util.Scanner;
public class Ejercicio3 {
    public static void ejecutar(){
        Scanner leer = new Scanner(System.in);
        int n;
        System.out.println("ingrese el n numeros");
        n = leer.nextInt();
        int n1=0;
        int n2=1;
        int n3=1;
        int x=1;
        while (x <= n){
            System.out.print(n1+" ");
            System.out.print(n2+" ");
            System.out.print(n3+" ");
            n1=n1 + n2 + n3;
            n2 = n1 + n3 + n2;
            n3 = n2 + n1 + n3;
        x = x+1;
        }
    }
}
