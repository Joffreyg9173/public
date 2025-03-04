import java.util.Scanner;

public class Point {
    static void calculator(int num1, int num2, int num3) {
        System.out.println("Sum of numbers is " + (num1 + num2 + num3));
        System.out.println("Subtraction of numbers is " + (num1 - num2 - num3));
        System.out.println("Multiplication of numbers is " + (num1 * num2 * num3));
        
        // Correcting the modulo operation:
        System.out.println("Modulo result is " + (num1 % num2 % num3));
        
        if (num2 == 0 || num3 == 0) {
            System.out.println("Error: Division by zero");
        } else {
            System.out.println("Division result is " + (num1 / num2 / num3));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number num1: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter number num2: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter number num3: ");
        int num3 = scanner.nextInt();
        scanner.close();

        calculator(num1, num2, num3);
    }
}
