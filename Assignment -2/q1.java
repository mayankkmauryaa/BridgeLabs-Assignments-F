import java.time.*;

public class q1 {
    public static void main(String[] args) {
        ZoneId zone = ZoneId.systemDefault();
        System.out.println(zone);
        ZoneId kolkataZone = ZoneId.of("Asia/Kolkata");
        System.out.println(kolkataZone);

        ZonedDateTime now = ZonedDateTime.now();
        System.out.println("Current Zone datatime : "+now);

        ZonedDateTime america_time = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println(america_time);

        ZonedDateTime kolkata_time= ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println(kolkata_time);
    }
}
