import java.util.Scanner;

public class Bucle3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // VARIABLES ///

        System.out.println("ESCRIBE EL VALOR DE A");
        int num1 = sc.nextInt();

        System.out.println("ESCRIBE EL VALOR DE B");
        int num2 = sc.nextInt();

        int producto = 0;
        int contador = 0;

        // ALGORITMO ///

        while (contador < num2){
            producto = producto + num1;
            contador = contador +1; // Las vueltas que dara contando la vuelta 0
        }
        System.out.printf(num1 + " * " + num2 + " ES IGUAL A " + producto );
       sc.close();
    }
}
