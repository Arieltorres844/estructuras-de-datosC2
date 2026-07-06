
class nodo {

    int dato;
    nodo next;

    public nodo() {
        dato = 0;
        next = null;
    }

    public nodo(int a) {
        dato = a;
        next = null;
    }
    public void concatenar(nodo nod){
        next = nod;
    }
}

public class Ejemplo1 {

    public static void main(String[] args) {
        nodo objA = new nodo(8);
        System.out.println("objeto A:"+objA);
        nodo objB = new nodo(4);
        System.out.println("objeto B:" +objB);
        nodo objC = new nodo(15);
        System.out.println("objeto C:" +objC);
        objA.concatenar(objB);
        System.out.println("next A:" +objA.next);
    }
}
