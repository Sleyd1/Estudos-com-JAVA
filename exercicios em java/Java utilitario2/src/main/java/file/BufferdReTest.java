package file;

import java.io.*;

public class BufferdReTest {
    public static void main(String[] args) {
        File file = new File("arquivoex\\file2.txt");

        try(FileReader fw = new FileReader(file); BufferedReader br = new BufferedReader(fw)) {
            String linha;
            while ((linha = br.readLine()) != null){
                System.out.println(linha);
            }
            //ler

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
