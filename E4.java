package lab2pooi2313215;

import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un año: ");
        int in= sc.nextInt();

        int i = in % 12;

        switch (i) {
            case 0:
                System.out.println(in + " es el año del mono.");
                break;
            case 1:
                System.out.println(in + " es el año del gallo.");
                break;
            case 2:
                System.out.println(in + " es el año del perro.");
                break;
            case 3:
                System.out.println(in + " es el año del cerdo.");
                break;
            case 4:
                System.out.println(in + " es el año de la rata.");
                break;
            case 5:
                System.out.println(in + " es el año del buey.");
                break;
            case 6:
                System.out.println(in + " es el año del tigre.");
                break;
            case 7:
                System.out.println(in + " es el año del conejo.");
                break;
            case 8:
                System.out.println(in + " es el año del dragon.");
                break;
            case 9:
                System.out.println(in + " es el año de la serpiente.");
                break;
            case 10:
                System.out.println(in + " es el año del caballo.");
                break;
            default:
                break;
        }

        sc.close();
    }
}
