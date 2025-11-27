import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class calenderformat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter year (e.g., 2026): ");
        int year = input.nextInt();

        System.out.print("Enter month (1-12): ");
        int month = input.nextInt();

        // Create a LocalDate for the first day of the month
        LocalDate date = LocalDate.of(year, month, 1);
        DayOfWeek firstDayOfWeek = date.getDayOfWeek();

        // Get how many days are in that month
        int daysInMonth = date.lengthOfMonth();

        // Print header
        String monthName = date.getMonth().toString().substring(0, 1)
                + date.getMonth().toString().substring(1).toLowerCase();
        System.out.println("\nCalendar for the month of " + monthName + ", " + year);
        System.out.println("Su  Mo  Tu  We  Th  Fr  Sa");

        // Determine position of the first day (1 = Monday, 7 = Sunday)
        int startDay = firstDayOfWeek.getValue();
        
        // Adjust because we want Sunday = 0
        if (startDay == 7) startDay = 0;

        // Print initial spaces
        for (int i = 0; i < startDay; i++) {
            System.out.print("    ");
        }

        // Print days of the month
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%-4d", day);

            // Move to next line after Saturday
            if ((day + startDay) % 7 == 0) {
                System.out.println();
            }
        }

        System.out.println();
        input.close();
    }
}
