import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int base;
        int i;
        int j;
        int exponente;
        int potencia = 0;
        int expo = 0;
        System.out.println("Introduce una base: ");
        base = sc.nextInt();
        System.out.println("Introduce un exponente máximo: ");
        exponente = sc.nextInt();
            for(i=1; i<=exponente; i ++){
                potencia=1;
                expo=i;
                for(j=0; j< expo;j++){
                    potencia *= base;
                }
            
                System.out.println(base + "^" + i + "=" + potencia);
        sc.close();   
            }
    }
}