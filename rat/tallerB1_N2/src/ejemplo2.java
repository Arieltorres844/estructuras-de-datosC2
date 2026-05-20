
import java.util.Scanner;

public class ejemplo2 {

    static Scanner tcl = new Scanner(System.in);
    static String[] tickets = new String[20];

    public static void main(String[] args) {

        int op;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Reservar ticket");
            System.out.println("2. Mostrar tickets");
            System.out.println("3. editar tickets");
            System.out.println("4. Vaciar ticket");
            System.out.println("5. Salir");
            System.out.print("Elija una opcion: ");

            op = tcl.nextInt();
            tcl.nextLine();

            switch (op) {

                case 1:
                    reservarTicket();
                    break;

                case 2:
                    mostrarTickets();
                    break;

                case 3:
                    editarTicket();
                    break;

                case 4:
                    vaciarTicket();
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion invalida");
            }

        } while (op != 5);
    }

    public static void reservarTicket() {

        int tipo, inicio = 0, fin = 0;
        boolean encotrado = false;

        System.out.println("\n--- MENU ---");
        System.out.println("1. vip");
        System.out.println("2. palco");
        System.out.println("3. general");
        System.out.println("seleccione tipo");

        tipo = tcl.nextInt();
        tcl.nextLine();

        if (tipo == 1) {
            inicio = 0;
            fin = 4;

        } else if (tipo == 2) {
            inicio = 5;
            fin = 9;

        } else if (tipo == 3) {
            inicio = 10;
            fin = 19;

        } else {
            System.out.println("tipo invalido");
            return;
        }

        for (int i = inicio; i <= fin; i++) {

            if (tickets[i] == null) {

                System.out.print("Ingrese su cedula: ");
                tickets[i] = tcl.nextLine();

                System.out.println("ticket reservado correctamente");
                System.out.println("numero de tickets " + (i + 1));

                encotrado = true;
                break;
            }
        }

        if (encotrado == false) {
            System.out.println("ya no hay tickets disponibles");
        }
    }

    public static void mostrarTickets() {
        String tipo;
        System.out.println("\n---lista de tickets---");
        for (int i = 0; i < tickets.length; i++) {
            if (i + 1 >= 1 && i + 1 <= 5) {
                tipo = "vip";
            } else {
                if (i + 1 >= 6 && i + 1 <= 10) {
                    tipo = "palco";
                } else {
                    tipo = "general";
                }
            }
            if (tickets[i] == null) {
                System.out.println("ticket" + (i + 1) + "[" + tipo + "] disponible");
            } else {
                System.out.println("ticket" + (i + 1) + "[" + tipo + "] cedula:" + tickets[i]);
            }
        }
    }

    public static void vaciarTicket() {

        int num;

        System.out.print("Ingrese ticket a liberar: ");
        num = tcl.nextInt();

        if (num < 1 || num > 20) {

            System.out.println("Numero invalido");

        } else {

            tickets[num - 1] = null;
            System.out.println("Ticket liberado");
        }
    }

    public static void editarTicket() {
        int num;

        System.out.print("Ingrese numero de ticket (1-20): ");
        num = tcl.nextInt();
        tcl.nextLine();
        if (num < 1 || num > 20) {
            System.out.println("Numero invalido");
        } else if (tickets[num - 1] != null) {
            System.out.print("Ingrese su nueva cedula: ");
            tickets[num - 1] = tcl.nextLine();

            System.out.println("Ticket actualizado");

        } else {

            System.out.println("Ese ticket esta vacio");
        }
    }
}
