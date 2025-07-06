package local;

import java.text.NumberFormat;
import java.util.Locale;

// Internacionalização Moedas com Locale
public class InternMoeda {
    public static void main(String[] args) {
        Locale localBr =new Locale("pt","br");
        Locale localJP = Locale.JAPAN;
        Locale localUSA = Locale.US;
        NumberFormat[] num = new NumberFormat[3];
        num[0] = NumberFormat.getCurrencyInstance(localBr);
        num[1] = NumberFormat.getCurrencyInstance(localJP);
        num[2] = NumberFormat.getCurrencyInstance(localUSA);
        double valor = 1_000_000.78655;

        for (NumberFormat numb : num){
            numb.setMaximumFractionDigits(2);
            System.out.println(numb.getMaximumFractionDigits());
            System.out.println(numb.format(valor));
        }

    }
}
