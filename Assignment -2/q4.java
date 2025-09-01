import java.time.LocalDate;
import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take two date inputs in yyyy-MM-dd format
        System.out.print("Enter first date (yyyy-MM-dd): ");
        String date1Input = sc.nextLine();

        System.out.print("Enter second date (yyyy-MM-dd): ");
        String date2Input = sc.nextLine();

        // Convert input to LocalDate
        LocalDate date1 = LocalDate.parse(date1Input);
        LocalDate date2 = LocalDate.parse(date2Input);

        // Compare dates
        if (date1.isBefore(date2)) {
            System.out.println(date1 + " is BEFORE " + date2);
        } else if (date1.isAfter(date2)) {
            System.out.println(date1 + " is AFTER " + date2);
        } else if (date1.isEqual(date2)) {
            System.out.println(date1 + " is EQUAL to " + date2);
        }
    }
}
