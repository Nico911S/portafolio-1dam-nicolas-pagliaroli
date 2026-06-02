import java.util.Scanner;

public class Bucle {
    public static void main(String[] args) {
        System.out.println("ESCRIBE EL VALOR DE BASE");
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();

        System.out.println("ESCRIBE EL VALOR DE EXPONENTE");
        int exponente = sc.nextInt();
        int potencia = 1;
        int contador = 0;

        while (contador < exponente) {
            potencia = potencia * base;
            contador = contador + 1;
        }
        System.out.println(base + " ELEVADO A " + exponente + " = " + potencia);
        sc.close();
    }
}