import java.util.Scanner;

public class IF {
    public static void main(String[] args) {
        // USO //
        Scanner sc = new Scanner(System.in);

        //VARIABLES//
        System.out.println("ESCRIBE UN PRIMER NUMERO");
        int num1 = sc.nextInt();

        System.out.println("ESCRIBE UN SEGUNDO NUMERO");
        int num2 = sc.nextInt();

        //ALGORITMO///
        if (num1 == num2) {
            System.out.println(num1 + " ES IGUAL A " + num2);
        }
        else if (num1 > num2) {
            System.out.println(num1 + " ES MAYOR QUE " + num2);
        }
        else {
            System.out.println(num1 + " ES MENOR QUE " + num2);
        }
        sc.close();
    }
}