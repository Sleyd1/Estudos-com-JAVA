package file;

import java.io.*;

public class BufferdWTest {
    public static void main(String[] args) {
        File file = new File("arquivoex\\file2.txt");

        try(FileWriter fw = new FileWriter(file, true); BufferedWriter br = new BufferedWriter(fw)) {
            br.newLine();
            br.write("O Eu quero ser feliz e ter um vida tranquila no meu futuro");

            br.flush();

            //para ler o arquivo va ate a classe filertest e execute ela

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
