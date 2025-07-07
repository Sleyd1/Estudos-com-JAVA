package local;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
//todas as vezes que utilizamos Format estamos transformando um objeto em uma String
// todas as vezes que utilizamos parse estamos transformando uma String em um objeto
public class DateTimeFormatterTest {
    public static void main(String[] args) {
       LocalDateTime date = LocalDateTime.now();
       String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
       String s2 = date.format(DateTimeFormatter.ISO_DATE);
       String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);


       LocalDateTime parse1 = LocalDateTime.parse("20210219 ",DateTimeFormatter.BASIC_ISO_DATE);
       LocalDateTime parse2 = LocalDateTime.parse("2021-02-19+05:00",DateTimeFormatter.ISO_DATE);
       LocalDateTime parse3 = LocalDateTime.parse("2021-02-19",DateTimeFormatter.ISO_LOCAL_DATE);


        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(parse3);

        LocalDateTime now = LocalDateTime.now();

        String s4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(s4);
        LocalDateTime parse4 = LocalDateTime.parse("2021-02-19T18:46:04.1121294", DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(parse4);


        DateTimeFormatter formatterbr = DateTimeFormatter.ofPattern("dd/mm/yy");
        String formatbrr = LocalDate.now().format(formatterbr);
        System.out.println(formatbrr);
        LocalDate parsebr = LocalDate.parse("19/02/2021", formatterbr);
        System.out.println(parsebr);


    }
}
