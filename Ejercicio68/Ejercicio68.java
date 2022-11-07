package java_capitulo_5.Ejercicio68;
import java.util.Scanner;

public class Ejercicio68 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor introduzca un número entero positvo : ");
        long num=sc.nextLong();
        long volteado = 0;
        long numcopia=num;
        System.out.print("El número dislocado es : ");
        while(numcopia>0){
            volteado=(volteado*10)+(numcopia%10);
            numcopia=numcopia/10;
        }

        while(volteado>0){
            if((volteado%10)%2==0){
            System.out.print(volteado%10 +1);
        }else{
            System.out.print(volteado%10 -1);
        }
        volteado=volteado/10;
    }

    }
}
