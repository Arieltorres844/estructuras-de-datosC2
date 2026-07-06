
class Persona {

    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void cambiar(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}

public class ejemplo {

    public static void main(String[] args) {

        Persona personaA = new Persona("Ana", 22);
        System.out.println("personaA:" + personaA + "\n");
        Persona personaB = new Persona("Juan", 25);
        System.out.println("personaB:" + personaB + "\n");
        Persona personaC = new Persona("Kevin", 22);
        System.out.println("personaC:" + personaC + "\n");
        personaA.cambiar("Ana", 25);
        personaA.mostrar();
        personaC.mostrar();
    }
}
