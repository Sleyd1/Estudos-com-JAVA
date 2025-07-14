package file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWTest {
    public static void main(String[] args) {
        File file = new File("arquivoex\\file2.txt");

        try(FileWriter fw = new FileWriter(file)) {
            //new FileWriter(file, true) para adicionar mais conteudo sem deletar oq ja estava escrito

            boolean iscreated = file.createNewFile();
            System.out.println("Arquivo criado "+iscreated);
            fw.write("Wesley Junio recebe R$4000 (eu atraio eu recebo kkkkkk)");
            fw.flush();


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
