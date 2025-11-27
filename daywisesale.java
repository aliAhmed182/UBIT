import java.io.*;
import java.util.*;
import java.text.*;
import java.time.DayOfWeek;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.text.ParseException;

public class daywisesale {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\Multi Computers\\OneDrive\\OOPS\\EVE01Sales.txt";
        Map<String, Double> dayNameSales = new LinkedHashMap<>();
        double grandTotal = 0;

        // Weekday formatter
        SimpleDateFormat dayFormatter = new SimpleDateFormat("EEEE", Locale.ENGLISH);

        // Possible input date formats in file
        SimpleDateFormat[] dateFormats = {
            new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH),
            new SimpleDateFormat("MMM-dd-yy", Locale.ENGLISH)
        };

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line = br.readLine(); // skip header

            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\\t");
                if (parts.length < 6) continue;

                String dateStr = parts[0].trim();
                int qty = Integer.parseInt(parts[4].trim());
                double unitPrice = Double.parseDouble(parts[5].trim());
                double amount = qty * unitPrice;

                LocalDate date = null;

                // Try parsing with available formats
                for (SimpleDateFormat df : dateFormats) {
                    try {
                        DateTimeFormatter D1 = DateTimeFormatter.ofPattern("d-MM-yy");
                        date = df.localdate.parse(dateStr , D1 );
                        DayOfWeek dayOfWeek = date.getDayOfWeek();
                        break; // stop if parsed successfully
                    } catch (ParseException ignored) {}
                }

                if (date == null) continue; // skip if date not parsed

                String dayName = dayFormatter.format(date);


                dayNameSales.put(dayName,
                        dayNameSales.getOrDefault(dayName, 0.0) + amount);

                grandTotal += amount;
            }

            System.out.println("Day Name wise Sales Amount:");
            for (String day : dayNameSales.keySet()) {
                System.out.println(day + " : " + dayNameSales.get(day));
            }

            System.out.println("Grand Total: " + grandTotal);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
