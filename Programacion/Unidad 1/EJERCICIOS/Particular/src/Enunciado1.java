import java.util.Scanner;

public class Enunciado1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println(" ERES EL PROPIETARIO DE LA MAQUINA? ");
        Boolean isOwner = sc.nextBoolean();

        if (isOwner) {
            System.out.println(" HOLA, BIENVENIDO AL SISTEMA");}
        else {
            System.out.println(" NO ERES EL PROPIETARIO DEL SISTEMA");}
        sc.close();
    }
}
