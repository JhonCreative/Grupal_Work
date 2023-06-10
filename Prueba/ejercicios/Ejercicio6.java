package ejercicios;
// check
import java.util.Scanner;
public class Ejercicio6 {
    public static void ejecutar(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un texto -> ");
        String palabra = scan.nextLine();
        String resultado = espacio(palabra);
        System.out.println(resultado);
    }
    public static String espacio(String palabra){
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < palabra.length(); i++) {
            char c = palabra.charAt(i);
            text.append(c).append(" ");
        }
        return text.toString();
    }
}