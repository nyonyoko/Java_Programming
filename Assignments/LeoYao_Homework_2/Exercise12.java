// https://docs.oracle.com/javase/8/docs/api/java/time/LocalDateTime.html
// https://docs.oracle.com/javase/8/docs/api/java/time/format/TextStyle.html
// https://docs.oracle.com/javase/8/docs/api/java/util/Locale.html

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class Exercise12 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm:ss");
        String newTime = dateTime.format(timeFormat);
        String dayName = dateTime.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault());
        String monthName = dateTime.getMonth().getDisplayName(TextStyle.FULL, Locale.getDefault());
        String dateName = String.valueOf(dateTime.getDayOfMonth());
        String monthDate = monthName+" "+dateName;
        String yearName = String.valueOf(dateTime.getYear());
        System.out.println(String.join(", ", dayName, monthDate, yearName, newTime));
    }
}
