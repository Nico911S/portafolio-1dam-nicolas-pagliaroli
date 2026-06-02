import java.sql.SQLOutput;
import java.util.Scanner;

public class IFELSE {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("INGRESE EL PRECIO DEL ARTICULO");
        int producto = sc.nextInt();
        double impuesto;
        double precio;
        if(producto > 300) {
            impuesto = producto * 0.05;
            precio = impuesto + producto;
            System.out.println(" IMPUESTO DE ARTICULO: " + impuesto);
            System.out.println(" ARTICULO: " + producto + " + IMPUESTO:s " + impuesto + " = TOTAL " + precio); }
        else{
            System.out.println(" EL PRECIO DEL ARTICULO ES " + producto); }
        sc.close();
        }
    }
