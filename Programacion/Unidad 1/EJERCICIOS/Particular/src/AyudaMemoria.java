import java.util.Scanner; // 📥 Importamos Scanner para leer datos del usuario

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 🧠 Creamos el lector

        System.out.print("Ingresá un número positivo (o un número negativo para salir): ");
        int numero = sc.nextInt(); // ✍️ Leemos el primer número

        // 🧠 ESTRUCTURA DEL BUCLE WHILE
        while (numero >= 0) {
            // 🔁 Mientras la condición sea verdadera, se repite este bloque.
            // En este caso, mientras 'numero' sea mayor o igual a 0.

            System.out.println("Ingresaste: " + numero); // 📤 Mostramos el número ingresado

            System.out.print("Ingresá otro número (negativo para terminar): ");
            numero = sc.nextInt(); // ✍️ Pedimos otro número dentro del bucle
        }

        // 🛑 Cuando la condición ya no se cumple (numero < 0), el bucle termina
        System.out.println("Fin del programa 👋");

        sc.close(); // 🔚 Cerramos el Scanner
    }
}