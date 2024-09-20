package ClassMore.javaDate.currentDate;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //create obj use now() to get the uptodate
        LocalDate myObj = LocalDate.now();

        //output the date
        System.out.println(myObj);
    }    
}
