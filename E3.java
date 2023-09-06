package lab2pooi2313215;
import java.util.Scanner;
public class E3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double SA, NuevoS=0; 
        int desempeño; 
        System.out.print("ingresa el sueldo actual del trabajador: ");
        SA= in.nextDouble();
        System.out.print("ingresa la calificación de desempeño: ");
        desempeño= in.nextInt();
        if(desempeño==1){
            NuevoS=(SA*0.06)+SA;
        }else if(desempeño==2){
            NuevoS=(SA*0.04)+SA;
        }else {
            NuevoS=(SA*0.15)+SA;
        }
        System.out.println("Su aumento es de: " + (SA*0.06) + " soles.");
        System.out.println("Su nuevo salario es de: " + NuevoS + " Soles ");
    }
}
