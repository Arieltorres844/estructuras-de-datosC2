
import java.util.Scanner;

public class ejercicio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start;
        int end;
        System.out.print("deme dos numeros: ");
        start = sc.nextInt();
        end = sc.nextInt();
        int suma = Suma(start, end);
        System.out.println("la suma es de: " + suma);
    }

    public static int Suma(int start, int end) {
        if (start == end) {
            return start;
        }
        if (start < end) {
            return start + Suma(start + 1, end);
        } else {
            return start + Suma(start - 1, end);
        }
    }
}
