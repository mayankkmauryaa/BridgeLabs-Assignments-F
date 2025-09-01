import  java.time.*;
import java.time.format.DateTimeFormatter;
public class q3 {
    public static void main(String[] args) {
        DateTimeFormatter format= DateTimeFormatter.ofPattern("dd/MM/yyyy z");
        DateTimeFormatter format2= DateTimeFormatter.ofPattern("yyyy/MM/dd z");
        DateTimeFormatter format3= DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy z");

        ZonedDateTime kolkata = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("Inn 1st format : "+kolkata.format(format));
        System.out.println("Inn 2nd format : "+kolkata.format(format2));
        System.out.println("Inn 3rd format : "+kolkata.format(format3));
    }
}
