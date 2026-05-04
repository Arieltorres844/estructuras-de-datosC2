
import java.util.Scanner;
public class NewClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int n2;
        System.out.print("deme el valor de n: ");
        n=sc.nextInt();
        int fact = factorial(n);
        int sum = suma(n);
        System.out.println("el factorial de " +n+ " es " +fact);
        System.out.println("la suma de " +n+ " mas su factorial es " +sum);
    }
    public static int factorial(int n){
        if(n == 1){
        return 1;        
    }else{
            return(n*factorial(n-1));
        }
    }
    public static int suma(int n){
        if(n == 1){
        return 1;        
    }else{
            return(n + factorial(n-1));
        }
    }
}
