import javax.swing.*;
import java.util.Scanner;

public class Calculator extends JPanel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer número: ");
        int num1 = sc.nextInt();

        System.out.println("Introduce el segundo número: ");
        int num2 = sc.nextInt();

        System.out.println("¿Qué operación quieres realizar?");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");

        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("El resultado de la suma es: " + (num1 + num2));
                break;
            case 2:
                System.out.println("El primer resultado de la resta es: " + (num1 - num2));
                break;
            case 3:
                System.out.println("El resultado de la multiplicación es: " + (num1 * num2));
                break;
            case 4:
                System.out.println("El resultado de la division es: " + (num1 / num2));
                break;
            default:
                System.out.println("Opción no válida");
        }
    }
}