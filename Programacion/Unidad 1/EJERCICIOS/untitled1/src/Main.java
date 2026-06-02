import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String piece;
        System.out.println("Introduce la inicial del nombre de la pieza de ajedrez:");
                piece = sc.nextLine();
        if (piece.equalsIgnoreCase("R")){ //Rey
            System.out.println("Rey: Puede moverse en todas direcciones pero solo avanza una posición.");
        } else if (piece.equalsIgnoreCase("D")) { //Dama o reina
            System.out.println("Dama/Reina: Puede moverse en todas las direcciones y tantas casillas como desee.");
        } else if (piece.equalsIgnoreCase("T")) { //Torre
            System.out.println("Torre: Puede moverse tantas casillas como quiera en linea vertical u horizontal");
        }else if (piece.equalsIgnoreCase("A")) { //Alfil
                System.out.println("Alfil: Puede moverse tantas casillas como quiera en diagonal");
        }else if (piece.equalsIgnoreCase("C")) { //Caballo
            System.out.println("Caballo: Puede moverse en en forma de 'L': 2 casillas en una direccion y 1 una en perpendicular.");
        }else if (piece.equalsIgnoreCase("P")) { //Peon
            System.out.println("Peon: Puede moverse solo hacia adelante y en su primer movimiento puede moverse 2 casillas luego de ello solo una");}
        else {
            System.out.println("ESTA INICIAL NO CORRESPONDE A NINGUNA PIEZA");}
        sc.close();
    }
}
