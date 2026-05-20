
import java.util.Scanner;

public class ejemplo1 {

    static String[] paginas = new String[5];
    static int tope = -1;

    public static void main(String[] args) {

        Scanner tcl = new Scanner(System.in);

        int opcion = 0;

        while (opcion != 4) {

            System.out.println("\n1. visitar pagina");
            System.out.println("2. Eliminar pagina");
            System.out.println("3. mostrar paginas");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = tcl.nextInt();
            tcl.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("Deme el nombre de la pagina: ");
                    String pagina = tcl.nextLine();

                    push(pagina);

                    break;

                case 2:

                    String eliminada = eliminarPagina();

                    if (eliminada != null) {
                        System.out.println("Pagina eliminada: " + eliminada);
                    }

                    break;
                case 3:
                    mostrarPaginas();
                    break;

                case 4:

                    System.out.println("Fin del programa");
                    break;

                default:

                    System.out.println("Opcion incorrecta");
            }
        }
    }

    public static boolean pilaVacia() {
        return tope == -1;
    }

    public static void push(String pagina) {

        if (tope < paginas.length - 1) {

            tope++;
            paginas[tope] = pagina;

            System.out.println("Pagina guardada");

        } else {

            System.out.println("La pila esta llena");
        }
    }

    public static String eliminarPagina() {

        if (pilaVacia()) {

            System.out.println("Pila vacia");
            return null;

        } else {

            String item = paginas[tope];
            tope--;

            return item;
        }
    }

    public static void mostrarPaginas() {

        if (pilaVacia()) {

            System.out.println("La pila esta vacia");

        } else {

            System.out.println("Paginas guardadas:");

            for (int i = tope; i >= 0; i--) {

                System.out.println(paginas[i]);
            }
        }
    }
}
