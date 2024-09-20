package ClassMore.javaDate.datetimeformatter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDateTime myDateTime = LocalDateTime.now();
        System.out.println("before formatting: " + myDateTime);

        DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = myDateTime.format(myFormatter);

        //formatted date output
        System.out.println("After formatting: " + formattedDate);
    }
}
