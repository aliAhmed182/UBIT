import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class calender {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter year: ");
        int year = input.nextInt();

        System.out.print("Enter month (1-12): ");
        int month = input.nextInt();

        // Create LocalDate for the first day of the given month and year
        LocalDate firstDay = LocalDate.of(year, month, 1);

        // Get total number of days in the month
        int daysInMonth = firstDay.lengthOfMonth();

        System.out.println("\nDays in " + firstDay.getMonth() + " " + year + ":");

        // Print each date and its corresponding day
        for (int i = 1; i <= daysInMonth; i++) {
            LocalDate dateObj = LocalDate.of(year, month, i);
            DayOfWeek weekday = dateObj.getDayOfWeek();
            System.out.println(dateObj + " : " + weekday);
        }

        input.close();
    }
}