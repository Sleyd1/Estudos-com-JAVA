package local;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class ExeData {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(2025,Calendar.JULY,1);
        int dias = cal.get(Calendar.DAY_OF_WEEK);
        System.out.println(cal);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy EEEE");
        switch (dias){
            case 1,2,3,4:
                cal.add(Calendar.DAY_OF_MONTH, 1); // avança 1 dia
                break;
            case 5:
                cal.add(Calendar.DAY_OF_MONTH, 4);
                break;
            case 6 :
                cal.add(Calendar.DAY_OF_MONTH, 3);
                break;
            case 7:
                cal.add(Calendar.DAY_OF_MONTH, 2);
        }
        System.out.println(sdf.format(cal.getTime()));

    }

}
