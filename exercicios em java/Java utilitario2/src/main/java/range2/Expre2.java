package range2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// expressões regulares
public class Expre2 {
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
        String regex3 = "([a-zA-Z0-9\\.])+@([a-z])+(\\.([a-z])+)+";
        String texto3 = "fulanodetal@gmail.com #sge4 ciclanodetal@hotmail.com wrrwr@gmail.com.br beltranodetal@gmail.com ";

        Pattern pattern = Pattern.compile(regex3);
        Matcher matcher = pattern.matcher(texto3);



        System.out.println("encontrei "+ regex +" nas posições: ");
        while (matcher.find()){
            System.out.println(matcher.start()+ " "+ matcher.group());
        }
    }
}
