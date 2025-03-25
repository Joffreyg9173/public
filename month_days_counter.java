import java.util.Scanner;

public class Babu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        scanner.close();

        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        int days;

        if (month < 1 || month > 12) {
            System.out.println("Invalid month!");
            return;
        }

        if (month == 2) { // February
            days = isLeap ? 29 : 28;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            days = 30;
        } else {
            days = 31;
        }

        System.out.println("This month has " + days + " days.");
        System.out.println("This year is " + year);
    }
}
