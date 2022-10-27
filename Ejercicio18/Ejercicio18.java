import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzaca el primer número: ");
        int n1 = sc.nextInt();
        System.out.println("Introduzca el segundo número: ");
        int n2 = sc.nextInt();
        int total = n1;
            while(total<n2-7){
                total=total+7;
                System.out.println(total + ", ");
            }
            sc.close();
    }
    
}
