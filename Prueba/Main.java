import ejercicios.Animales;
import ejercicios.Automoviles;
import ejercicios.Ejercicio1;
import ejercicios.Ejercicio2;
import ejercicios.Ejercicio3;
import ejercicios.Ejercicio4;
import ejercicios.Ejercicio5;
import ejercicios.Ejercicio6;
import ejercicios.Ejercicio7;
import ejercicios.Ejercicio8;
import ejercicios.Ejercicio9;
import ejercicios.Ejercicio10;
import ejercicios.Ejercicio11;
import ejercicios.Ejercicio12;
import ejercicios.Ejercicio13;
import ejercicios.Ejercicio14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        do {
            System.out.println("---------------------------------------------\n\tIngrese que problema desea ejecutar\n---------------------------------------------");
            for (int i = 1; i < 17; i++) {
                System.out.println(i+". Ejercicio "+i);
            }
            System.out.print("0. Salir ");
            System.out.print("-> ");
            num = scan.nextInt();
            limpiar_pantalla();
            switch (num) {
                case 1:
                    num_ejercicio(num);
                    Ejercicio1.ejecutar();
                    salir();
                    break;
                case 2:
                    num_ejercicio(num);
                    Ejercicio2.ejecutar();
                    salir();
                    break;
                case 3:
                    num_ejercicio(num);
                    Ejercicio3.ejecutar();
                    salir();
                    break;
                case 4:
                    num_ejercicio(num);
                    Ejercicio4.ejecutar();
                    salir();
                    break;
                case 5:
                    num_ejercicio(num);
                    Ejercicio5.ejecutar();
                    salir();
                    break;
                case 6:
                    num_ejercicio(num);
                    Ejercicio6.ejecutar();
                    salir();
                    break;
                case 7:
                    num_ejercicio(num);
                    Ejercicio7.ejecutar();
                    salir();
                    break;
                case 8:
                    num_ejercicio(num);
                    Ejercicio8.ejecutar();
                    salir();
                    break;
                case 9:
                    num_ejercicio(num);
                    Ejercicio9.ejecutar();
                    salir();
                    break;
                case 10:
                    num_ejercicio(num);
                    Ejercicio10.ejecutar();
                    salir();
                    break;
                case 11:
                    num_ejercicio(num);
                    Ejercicio11.ejecutar();
                    salir();
                    break;
                case 12:
                    num_ejercicio(num);
                    Ejercicio12.ejecutar();
                    salir();
                    break;
                case 13:
                    num_ejercicio(num);
                    Ejercicio13.ejecutar();
                    salir();
                    break;
                case 14:
                    num_ejercicio(num);
                    Ejercicio14.ejecutar();
                    salir();
                    break;
                case 15:
                    num_ejercicio(num);
                    Animales.ejecutar();
                    salir();
                    break;
                case 16:
                    num_ejercicio(num);
                    Automoviles.ejecutar();
                    salir();
                    break;
                case 0:
                    grupo();
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        } while (num!=0);

    }
    static void salir(){
        Scanner scan = new Scanner(System.in);
        System.out.println("\n\n----------------------------------\n1 para volver al menu");
        int salir = scan.nextInt();
        limpiar_pantalla();
    }
    static void num_ejercicio(int num){
                System.out.println("------------------------------------------\n\t\tEjercicio "+num+"\n------------------------------------------");
    }
    static void limpiar_pantalla(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    static void grupo(){
        System.out.println("Aranda Gutierrez Alex Marcelo");
        System.out.println("Calsina Paraya Jhon Kevin");
        System.out.println("Choque Gironda Mauricio");
        System.out.println("Manzaneda Flores Dante Amilcar");
        System.out.println("Medina Averanga Alex Rodrigo");
        System.out.println("Montecinos Catacora Ricardo Gabriel");
        System.out.println("Tumiri Quispe Roger");
    }
}