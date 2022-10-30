import java.util.Scanner;
import java.math.*;;

public class Ejercicio34 {
    public static void main(String[] args) {
        System.out.print("Introduzca un número: ");
        Scanner sc= new Scanner(System.in);
        long n1 = sc.nextLong();
        System.out.print("Introduzca otro número: ");
        long n2 = sc.nextLong();

        long n = n1;
        long m = n2;
        int pares = 0;
        int impares = 0;
        int _n = 0;
        int _m = 0;
        long mezcla = 0;

        while( n != 0){
            _n = (int)(n % 10);
            _m = (int)(m % 10);
            n= n / 10;
            m = m / 10;
            mezcla = mezcla*10 + _n;
            mezcla = mezcla*10 + _m;

                if(_n%2 == 0){
                    pares++;
                }else {
                    impares++;
                }


                if(_m%2 == 0){
                    pares++;
                }else {
                    impares++;
                }
                
        }

        int cont = 1;
        int valores = pares + impares;
        int v;
        long npar = 0 ;
        long nimpar = 0;
        int contpares = 1;
        int contimpares = 1;
        while(cont <= valores){
            v=  (int)(mezcla%10);
            if(v%2 == 0){
            npar = npar+(long)(v*Math.pow(10, (pares-contpares)));
            contpares++;
            } else {
            nimpar = nimpar+(long)(v*Math.pow(10,( impares-contimpares))) ;
            contimpares++;
            }
            mezcla = mezcla/10;
            cont++;
        }
        System.out.printf("El número formado por los dígitos pares es : " + npar);
        System.out.printf("\nEl número formado por los dígitos impares es : " + nimpar);
    }
}
