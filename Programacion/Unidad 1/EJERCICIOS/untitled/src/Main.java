import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        int A = 6;
        int B = 5;
        int C = 7;

        if (A > B && A > C) {
            System.out.println(" A: ES EL MAYOR ");
        } else if (B > A && B > C) {
            System.out.println(" B: ES EL MAYOR");
        } else if (C > B && A < C) {
            System.out.println(" C: ES ES EL MAYOR ");
        } else {
            System.out.println(" A, B Y C SON IGUALES");
        }
    }
}




