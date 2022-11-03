package java_capitulo_5.Ejercicio47;
import java.util.Scanner;

public class Ejercicio47 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Sabiendo que la altura tiene que ser un número entero impar mayor o igual que 5, introduzca la altura deseada:");
        int altura=sc.nextInt();
        int anchura=6;

        if(altura<5 && altura%2==0){
            System.out.println("Error al introducir los datos.");
        }else{
            System.out.print("MMMMMM");
            System.out.println("");
            for(int i=1;i<=altura/3;i++){
                System.out.print("M");
                for(int j=1;j<=4;j++){
                    System.out.print(" ");
                }
                System.out.print("M");
                System.out.println("");
            }
            System.out.print("MMMMMM");
            System.out.println("");
            for(int i=1;i<=altura/3;i++){
                System.out.print("M");
                for(int j=1;j<=4;j++){
                    System.out.print(" ");
                }
                System.out.print("M");
                
                System.out.println("");
            }
            System.out.print("MMMMMM");
            System.out.println("");
        }
        sc.close();
    }
    
}
