public class Ejercicio22{
    public static void main(String[] args) {
        boolean primo = true;
        System.out.print("2");
        for (int i = 2 ; i<=100 ; i++){
            if (i%2==0){
                primo=false;    
            }
            for(int j = 3 ; i<=i/j && primo ; j+=2 ){
                if (i%j==0){
                    primo=false;
                }
            }
            if (primo){
                System.out.print(" "+i);
            }
            primo=true;
        }
        System.out.print(" 100");

    }
}