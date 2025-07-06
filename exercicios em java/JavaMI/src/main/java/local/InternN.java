package local;

import java.text.NumberFormat;
import java.util.Locale;

// Internacionalização Números com Locale
public class InternN {
    public static void main(String[] args) {
        Locale localBr =new Locale("pt","br");
        Locale localJP = Locale.JAPAN;
        Locale localUSA = Locale.US;
        NumberFormat[] num = new NumberFormat[3];
        num[0] = NumberFormat.getInstance(localBr);
        num[1] = NumberFormat.getInstance(localJP);
        num[2] = NumberFormat.getInstance(localUSA);
        double valor = 1_000_000.13;

        for (NumberFormat numb : num){
            System.out.println(numb.getMaximumFractionDigits());//gititos fracionarios
            System.out.println(numb.format(valor));
        }

    }
}
