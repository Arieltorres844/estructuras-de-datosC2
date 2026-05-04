
import java.util.Scanner;

public class areglo2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arraynum;
        arraynum = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("ingrese el num en posicion [" + i + "]:");
            arraynum[i] = in.nextInt();
        }
        for (int i = 0; i < arraynum.length; i++) {
            System.out.println("num en posicion [" + i + "]" + arraynum[i]);
        }
        System.out.print("Ingrese el numero a buscar: ");
        int numero = in.nextInt();

        int resultado = Buscar(arraynum, numero);

        if (resultado != -1) {
            System.out.println("Numero encontrado en la posicion [" + resultado + "]");
        } else {
            System.out.println("-1 (numero no encontrado)");
        }
    }
    public static int Buscar(int arrayum[], int numero) {
        for (int i = 0; i < arrayum.length; i++) {
            if (arrayum[i] == numero) {
                return i;
            }
        }
        return -1;
    }
}
