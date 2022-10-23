import java.util.Scanner;

public class Ejercicio20{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Dime la altura deseada: ");
        int altura = sc.nextInt();
        System.out.println("Ingrese el carácter para pintar la piramide");
        char caracter = sc.next().charAt(0); 

        for ( int i=1; i<=altura-1; i++){
            for (int x=altura-i; x>0; x--){
                System.out.print(" ");
            }if (i==1){
                System.out.print(caracter);
            }else{
                System.out.print(caracter);
                for (int z=1;z<=i*2-3;z++){
                    System.out.print(" ");
                }
            System.out.print(caracter);

            }
        
                System.out.println("");
        }

        for (int z=1;z<=altura*2-1;z++){
            System.out.print(caracter);
        }
        sc.close();
    }
}
    