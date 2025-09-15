package lab2pooi2313215;
import java.util.*;
public class E1 {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.print("ingrese un número a evaluar: ");
        try {
            long x=in.nextLong();
            System.out.println(x + " Puede ser almacenado en: ");
            if (x>= -128 && x<= 127){
                System.out.println( "* Byte");
            }
            if (x>= -32768 && x<= 32.767){
                System.out.println( "* Short");
            }
            if (x>= -2147483648 && x <= 2147483647){
                System.out.println("* Int");
            }
            if (x>= Long.MIN_VALUE && x<= Long.MAX_VALUE){
                System.out.println("* Long");
            }


        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(in.next() + " no puede ser inicializado en ningun lado");
        }
    }
    
}

