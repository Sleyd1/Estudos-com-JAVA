package file;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileRTest {
    public static void main(String[] args) {

        File file = new File("arquivoex\\file2.txt");

        try(FileReader fr = new FileReader(file)) {

           /* char[] in = new char[30];
            fr.read(in);
            for(char c : in){
                System.out.print(c);
            }*/
            //primeiro forma de ler

            int i;
            while ((i = fr.read()) != -1){
                System.out.print((char)i);
            }
            //segunda forma

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
