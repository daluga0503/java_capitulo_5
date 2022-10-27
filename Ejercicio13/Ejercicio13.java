import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Intoduce 10 números ");
        int valor;
        int n=10;
        for(int i =0; i<n; i++){
            System.out.println("Introudce un número: ");
            valor = sc.nextInt();
                if(valor>0){
                    System.out.println("El número es positivo. ");
                }else{
                    System.out.println("El número es negativo. ");
                }
        }
        sc.close();
    }
}
