package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// expressões regulares
public class Expres1 {
    public static void main(String[] args) {
        //meta caracteres:
        // \d todos os digitos
        // \D tudo o que não for digitos
        // \s Espaços em branco \t \n \e
        // \S Todos os caracteres excluindo os brancos
        // \w a-ZA-Z, digitos, ...
        // \W tudo que não for incluso no \w

        String regex = "aba";
        String regex2 = "\\s";
        String texto = "abababa";
        String texto2 = "@#hh_j2 12gnh21";
        Pattern pattern = Pattern.compile(regex2);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("encontrei "+ regex +" nas posições: ");
        while (matcher.find()){
            System.out.println(matcher.start());
        }
    }
}
