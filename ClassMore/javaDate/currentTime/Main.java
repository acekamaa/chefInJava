package ClassMore.javaDate.currentTime;
import java.time.LocalTime;//imports time in the format(hour, minute, seconds and nanoseconds)

public class Main {
    public static void main(String[] args) {
        LocalTime myObj = LocalTime.now();

        //output the localtime
        System.out.println(myObj);
    }    
}
