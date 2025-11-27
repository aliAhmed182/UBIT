import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class localdate {
    public static void main(String[] args) {
       LocalDate Localdate = LocalDate.of(2025, 11, 9); 
       DateTimeFormatter D1 = DateTimeFormatter.ofPattern("d-MM-yy");
       String SD1 = D1.format(Localdate);
       System.out.println(SD1);
    }
}
