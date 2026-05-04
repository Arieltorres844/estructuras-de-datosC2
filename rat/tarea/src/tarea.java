import java.util.Scanner;
public class tarea {
    public static boolean esPalindromo(String texto) {
        if (texto.length() <= 1) {
            return true;
        }
        if (texto.charAt(0) != texto.charAt(texto.length() - 1)) {
            return false;
        }
        return esPalindromo(texto.substring(1, texto.length() - 1));
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa una palabra: ");
        String entrada = sc.nextLine();
        if (esPalindromo(entrada)) {
            System.out.println(" Si es palindromo");
        } else {
            System.out.println(" No es palindromo");
        }
        sc.close();
    }
}

