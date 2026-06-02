import java.util.Scanner;

public class Practica {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿ ERES EL PROPIETARIO DE LA MAQUINA ? (INTRODUCE TRUE O FALSE)");
        boolean isOwner = sc.nextBoolean();

        if (isOwner);{
            System.out.println("HOLA, BIENVENIDO AL SISTEMA");}

        System.out.println("NO ERES EL PROPIETARIO DE LA MAQUINA");

        sc.close();

    }

}