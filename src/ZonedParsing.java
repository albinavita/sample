import java.time.*;
import java.time.format.DateTimeFormatter;


public class ZonedParsing {
    public static void main(String[] args) {
//        String formDate = "yyyy-MM-dd'T'HH:mm:ss Z";
//        String value = "2023-10-01T00:00:00+03:00";
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formDate);
//        //ZonedDateTime zonedParsing = ZonedDateTime.parse(value, formatter);
//        ZonedDateTime zonedParsing = LocalDateTime.parse(value, formatter).atZone(ZoneId.systemDefault());
//                System.out.println(formatter);
//        System.out.println(zonedParsing);

        String formDate = "yyyy-MM-dd'T'HH:mm:ss Z";
        DateTimeFormatter formatter1= DateTimeFormatter.ofPattern(formDate);

        ZonedDateTime zonedDateTime = ZonedDateTime.parse("2011-12-03T10:15:30+01:00");
        System.out.println(zonedDateTime);
        ZonedDateTime zonedDateTime1 = ZonedDateTime.parse("2023-10-01T00:00:00.000+03:00");
        System.out.println(zonedDateTime1);

        ZoneId timeZone = ZoneId.systemDefault();
        String formDate1 = "yyyy-MM-dd'T'HH:mm:ss Z";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formDate1);
        ZonedDateTime zonedDateTime2 = LocalDateTime.parse("2023-10-01T00:00:00", DateTimeFormatter.ISO_DATE_TIME).atZone(timeZone);
                //DateTimeFormatter.ISO_DATE_TIME).atZone(timeZone);

        System.out.println(zonedDateTime2.format(formatter));

        String dt = ZonedDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ"));
        System.out.println(String.format("dt -> %s", dt));


        String zonedFormDate = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";
        String str = "2023-10-01T00:00:00.000+03:00";
        DateTimeFormatter zonedFormatter = DateTimeFormatter.ofPattern(zonedFormDate);

        String dateString = "2021-09-30T15:30:00.000+0300";

        DateTimeFormatter forma = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZZ");
        ZonedDateTime zoned = ZonedDateTime.parse(dateString, forma);



          System.out.println("zoned ->" + zoned);

        String dt2 = zoned.format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZZZZ"));
        System.out.println("dt2 -> " + dt2);

        String dt3 = zoned.format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSXXX"));
        System.out.println(dt3);

        System.out.println("====================");

        ZoneId timeZone9 = ZoneId.systemDefault();
        ZonedDateTime zonedDateTime9 = LocalDateTime.parse("2011-12-03T10:15:30",
                DateTimeFormatter.ISO_DATE_TIME).atZone(timeZone);
        System.out.println(zonedDateTime9);
        System.out.println("====================");

        String dateStr = "2012-10-01T09:45:00.000+02:00";
        String customFormat = "yyyy-MM-dd HH:mm:ss";

//        DateTimeFormatter dtf = ISODateTimeFormat.dateTime();
//        LocalDateTime parsedDate = dtf.parseLocalDateTime(dateStr);
//
//        String dateWithCustomFormat = parsedDate.toString(DateTimeFormat.forPattern(customFormat));
//        System.out.println(dateWithCustomFormat);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        System.out.println(LocalDateTime.now().minusMonths(3).withHour(0).withMinute(0).withSecond(0).withNano(0) );
    }
}
