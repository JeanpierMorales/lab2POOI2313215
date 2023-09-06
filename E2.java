package lab2pooi2313215;

import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        System.out.print("Ingrese un numero: ");
        num = in.nextInt();

        if(num % 2 == 0){
            if(num >= 2 && num <= 5){
                System.out.println("Sol");
            } else if(num >= 6 && num <= 20){
                System.out.println("Tierra");
            } else if(num > 20){
                System.out.println("Galaxia");
            }
        } else{
            System.out.println("Luna");
        }
    }
}
