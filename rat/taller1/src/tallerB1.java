
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class tallerB1 {

    public static void guardarEnArchivo(String texto, boolean resultado) {
        try {
            FileWriter writer = new FileWriter("C:\\Users\\SALASC\\Desktop\\palindromos.txt", true);

            if (resultado) {
                writer.write(texto + "\n");
            } else {
                writer.write("NO ES PALINDROMO\n");
            }

            writer.close();
        } catch (IOException e) {
            System.out.println("Error al guardar en archivo");
        }
    }

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

        System.out.print("Ingresa una palabra o frase: ");
        String entrada = sc.nextLine();

        boolean resultado = esPalindromo(entrada);

        if (resultado) {
            System.out.println("Si es palindromo");
        } else {
            System.out.println("No es palindromo");
        }

        guardarEnArchivo(entrada, resultado);

        System.out.println("Guardado en palindromos.txt");

        sc.close();
    }
}
