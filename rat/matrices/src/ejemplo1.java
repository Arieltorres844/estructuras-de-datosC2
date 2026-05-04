
    public class ejemplo1 {
        public static void main(String[] args) {
            int filas = 2;
            int columnas = 3;
            int [][] miMatriz2 = new int[filas][columnas];
            int [][] miMatriz= {{2,4,3} , {8,9,6},{3,6},{4,8,9}};
            int [][] miMatriz1 = {{2,4},{8,9,5}};
            print2D(miMatriz);
        }
        public static void print2D(int [][] miMatriz){
            for (int i = 0; i < miMatriz.length; i++) {
                for (int j = 0; j < miMatriz[i].length; j++) {
                    System.out.print(miMatriz[i][j]+" ");
                }
                System.out.println("");
            }
        }
    }