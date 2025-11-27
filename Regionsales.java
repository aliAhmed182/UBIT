import java.io.*;
import java.util.*;



public class Regionsales {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\Multi Computers\\OneDrive\\OOPS\\EVE01Sales.txt"; 
        Map<String, Double> Regionsales = new HashMap<>();
        double grandTotal = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line = br.readLine(); // Skip header line

            while ((line = br.readLine()) != null) {
                // Split using tab delimiter (\t)
                String[] parts = line.split("\\t");
                

                // Skip invalid lines
                if (parts.length < 6) continue; 

                String Region = parts[1].trim();
                int qty = Integer.parseInt(parts[4].trim());
                double unitPrice = Double.parseDouble(parts[5].trim());


                double amount = qty * unitPrice;

                // (Add to product-wise total)
                Regionsales.put(Region, Regionsales.getOrDefault(Region, 0.0) + amount);

                grandTotal += amount;
            }

            // Display results Region wise
            System.out.println("Region-wise Sales Amount Total:");
            for (String Region : Regionsales.keySet()) {
                System.out.println(Region + " : " + Regionsales.get(Region));
            }

            System.out.println("Grand Total: " + grandTotal);

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format in file.");
        }
    }
}