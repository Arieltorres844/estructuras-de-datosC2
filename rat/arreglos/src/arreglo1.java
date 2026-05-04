
import java.util.Scanner;


public class arreglo1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[]arraynum;
        arraynum= new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("ingrese el num en posicion ["+i+"]:");
            arraynum[i]= in.nextInt();
        }
        for (int i = 0; i < arraynum.length; i++) {
            System.out.println("num en posicion ["+i+"]"+arraynum[i]);
        }
    }
}
