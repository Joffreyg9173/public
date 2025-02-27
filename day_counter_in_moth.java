import java.util.Scanner;

public class Babu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create Scanner object

        System.out.print("Enter an month: ");
        int month = scanner.nextInt();  // Read integer input
        System.out.print("Enter an year: ");
        int year = scanner.nextInt();
        scanner.close();

        if (month <7) {
            if (month == 2 && year %4 ==0){
                System.out.println("this month has 28 days");
            }
            if (month % 2 ==0 && month !=2) {
                System.out.println("this month has 30 days");
            }
            else {
                if (month %2 ==1) {
                    System.out.println("this moth has 31 days");
                }
            }
        }
        else if(month>7 && month < 12){
            if(month % 2 ==0){
                System.out.print("this moth has 31 days");
            }
        }
    }
}
