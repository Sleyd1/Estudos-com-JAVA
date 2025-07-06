package local;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Local01 {
    public static void main(String[] args) {
        Locale localEUA = new Locale("us","US");//codigo ISO 366-1
        Locale localReinoU = new Locale("GB","gb");
        Locale localAUS = new Locale("au"," AU");
        Locale localJp = new Locale("ja"," JP");
        Calendar calendario = Calendar.getInstance();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localEUA);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localReinoU);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localAUS);
        System.out.println( "USA " + df1.format(calendario.getTime()));
        System.out.println("GBR "+ df2.format(calendario.getTime()));
        System.out.println("AUS "+ df3.format(calendario.getTime()));

        System.out.println(localEUA.getDisplayCountry(localJp));



    }
}
