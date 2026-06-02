import java.util.Scanner;
///  USAMOS EL DO Y EL WHILE ///
public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // VARIABLES ///

        System.out.println("ESCRIBE EL VALOR DE A");
        int num = sc.nextInt();

        int suma = 0;
        int contador = 1;

        // ALGORITMO ///

        do {
            suma += contador;
            contador++;
        } while (contador <= num);
            System.out.printf(" LA SUMA DE LOS NUMEROS NATURALES DE "+ num + " ES IUGAL A " + suma);
        }
    }


