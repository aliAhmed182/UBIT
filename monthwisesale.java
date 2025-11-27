import java.io.*;
import java.util.*;

public class monthwisesale{
    public static void main(String[] args) {
        String fileName = "C:\\Users\\Multi Computers\\OneDrive\\OOPS\\EVE01Sales.txt"; 
        Map<String, Double> monthSales = new LinkedHashMap<>();
        double grandTotal = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line = br.readLine(); // Skip header

            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\\t");

                if (parts.length < 6) continue;

                String date = parts[0].trim(); 
                int qty = Integer.parseInt(parts[4].trim());
                double unitPrice = Double.parseDouble(parts[5].trim());

                // Extract the first 3 letters of month
                // Date formats vary, so make consistent
                String monthPart = date.substring(date.indexOf('-') + 1);
                String month = monthPart.substring(0, 3);
                System.out.println(month);
                double amount = qty * unitPrice;

                // Add amount into respective month
                monthSales.put(month, monthSales.getOrDefault(month, 0.0) + amount);

                grandTotal += amount;
            }

            // Printable beauty
            System.out.println("Month-wise Sales Amount Total:");
            for (String month : monthSales.keySet()) {
                System.out.println(month + " : " + monthSales.get(month));
            }

            System.out.println("Grand Total: " + grandTotal);

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format in file.");
        }
    }
}
