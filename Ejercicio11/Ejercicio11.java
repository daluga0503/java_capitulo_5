import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        int i;
        System.out.println("Qué número quieres coger para realizar las operaciones: ");
        n = sc.nextInt();
        for(i = n; i < n+5; i ++){
            System.out.printf("%5d %10d %12d\n",i,i*i,i*i*i);
        }
        sc.close();
    }
}
