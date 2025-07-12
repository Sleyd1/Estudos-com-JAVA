package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// expressões regulares
public class Expres2 {
    public static void main(String[] args) {
        //meta caracteres:
        // \d todos os digitos
        // \D tudo o que não for digitos
        // \s Espaços em branco \t \n \e
        // \S Todos os caracteres excluindo os brancos
        // \w a-ZA-Z, digitos, ...
        // \W tudo que não for incluso no \w
        //[]

        String regex = "[abcABC]";
        // de A a C "[a-ZA-C]"
        String regex2 = "\\s";
        String texto = "abababa";
        String texto2 = "@#hh_j2 12gnh21 cafeBbAE";
        String regex3 = "0[xX][0-9a-fA-F]";
        String texto3 = "12 0x 0X 0xfffabc 0x109 0x1";

        Pattern pattern = Pattern.compile(regex3);
        Matcher matcher = pattern.matcher(texto3);



        System.out.println("encontrei "+ regex +" nas posições: ");
        while (matcher.find()){
            System.out.println(matcher.start()+ " "+ matcher.group());
        }
    }
}
