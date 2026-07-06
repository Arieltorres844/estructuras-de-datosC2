
public class main {

    public static void main(String[] args) {
        arbol_Binario bt = new arbol_Binario();
        bt.add(20);
        bt.add(15);
        bt.add(27);
        bt.add(28);
        bt.add(8);
        bt.add(16);
        System.out.println("arbol binario");
        bt.traversePreOrder(bt.root);
        bt.delete(27);
        bt.delete(28);
        System.out.println("arbol binario despues de elmiminar");
        bt.traversePreOrder(bt.root);
    }
}
