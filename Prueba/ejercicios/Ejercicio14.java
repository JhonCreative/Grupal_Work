package ejercicios;
// check
import java.util.Scanner;
public class Ejercicio14 {
    public static void ejecutar(){
        Scanner scan = new Scanner(System.in);
        int N;
        do {
            System.out.print("Ingrese el tamaño de la matriz (numeros impares) -> ");
            N = scan.nextInt();
            if (N%2!=0) {
                break;
            }
        } while (true);
        int[][] matriz = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == 0 || i == N - 1 || j == 0 || j == N - 1) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
