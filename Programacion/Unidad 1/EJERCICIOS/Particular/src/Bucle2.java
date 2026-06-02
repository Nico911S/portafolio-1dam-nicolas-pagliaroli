import java.util.Scanner;

public class Bucle2 {
    public static void main(String[] args) {

        ///  VARIABLES   ////

        Scanner sc = new Scanner(System.in);

        int contador = 0;
        int total = 0;
        int num;

        // El bucle se repite 4 veces o hasta que ingreses un número negativo
        while (contador < 4) {
            System.out.println("INGRESE UN NUMERO: ");
            num = sc.nextInt();

            if (num < 0) {
                System.out.println("Ingresaste un número negativo, se termina el programa.");
                break; // sale del bucle
            }

            total += num; // acumula la suma
            contador++;   // suma 1 al contador
        }

        System.out.println("LA SUMA TOTAL DE LOS NUMEROS POSITIVOS ES: " + total);

        sc.close();
    }
}