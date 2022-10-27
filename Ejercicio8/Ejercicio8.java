import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args){
        System.out.println("De que números quieres la tabla de multiplicar: ");
        Scanner sc = new Scanner(System.in);
        int n;
        n=sc.nextInt();
        for(int i = 0; i <=10; i ++){
            System.out.println(n+" * "+i+" = "+ (n*i));
        }
            sc.close();
    }
}
