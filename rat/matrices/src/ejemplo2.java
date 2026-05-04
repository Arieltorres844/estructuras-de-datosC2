
import java.util.Scanner;

public class ejemplo2 {

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
        System.out.println("--diagonal--");
        diagonal(miMatriz);
        System.out.println("--matriz traspuesta--");
        traspuesta(miMatriz);
    }

    public static void generarMatriz(int[][] miMatriz) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < miMatriz.length; i++) {
            for (int j = 0; j < miMatriz[i].length; j++) {
                System.out.println("ingrese elemento");
                miMatriz[i][j] = sc.nextInt();
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

    public static void diagonal(int[][] miMatriz) {
        if (miMatriz.length != miMatriz[0].length) {
            System.out.println("no es cuadrada");
            return;
        }
        for (int i = 0; i < miMatriz.length; i++) {
            System.out.println(miMatriz[i][i]);
        }
    }

    public static void traspuesta(int[][] miMatriz) {
        for (int i = 0; i < miMatriz[0].length; i++) {
            for (int j = 0; j < miMatriz.length; j++) {
                System.out.print(miMatriz[j][i] + " ");
            }
            System.out.println(" ");
        }
    }
}
