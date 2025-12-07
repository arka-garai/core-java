package _00Telusko._00xEnumToStreamAPI;
/*
Java 1.8 (Java 8) introduced the java.time package, which is known as the New Date and Time API.
 */
import java.time.*;

public class _33NewDateAndTimeDemo {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);

        int dayOfMonth = date.getDayOfMonth();
        int monthValue = date.getMonthValue();
        int year = date.getYear();

        System.out.println(dayOfMonth+" / "+monthValue+" / "+year);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        int hour = time.getHour();
        int minute = time.getMinute();
        int second = time.getSecond();
        int nano = time.getNano();

        System.out.println(hour+" : "+minute+" : "+second+" : "+nano);



    }
}
