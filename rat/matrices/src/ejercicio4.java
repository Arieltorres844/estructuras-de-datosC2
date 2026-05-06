
import java.util.Random;
import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("deme el numero de filas: ");
        int m = sc.nextInt();
        System.out.println("deme el numero de columnas:");
        int n = sc.nextInt();
        int miMatriz[][] = new int[m][n];
        generarMatriz(miMatriz);
        System.out.println("--matriz generada--");
        leerMatriz(miMatriz);
        if (m != n) {
            System.out.println("La matriz no es cuadrada, no se puede intercambiar por la diagonal.");
        } else {
            intercambiarDiagonalSecundaria(miMatriz);
            System.out.println("--matriz modificada--");
            leerMatriz(miMatriz);
        }
    }

    public static void generarMatriz(int[][] miMatriz) {
        Random ale = new Random();
        for (int i = 0; i < miMatriz.length; i++) {
            for (int j = 0; j < miMatriz[i].length; j++) {
                miMatriz[i][j] = ale.nextInt(10);
            }
        }
    }

    public static void leerMatriz(int[][] miMatriz) {
        for (int i = 0; i < miMatriz.length; i++) {
            for (int j = 0; j < miMatriz[i].length; j++) {
                System.out.print(miMatriz[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void intercambiarDiagonalSecundaria(int[][] miMatriz) {
        int n = miMatriz.length;
        int temp;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                temp = miMatriz[i][j];
                miMatriz[i][j] = miMatriz[n - 1 - j][n - 1 - i];
                miMatriz[n - 1 - j][n - 1 - i] = temp;
            }
        }
    }
}
