package Excecoes.exception;

import java.io.File;
import java.io.IOException;

public class ExceptionTest {
    public static void main(String[] args) {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo(){
        File file = new File("arquivoex\\teste.txt");
        try {
        boolean arquivo = file.createNewFile();
            System.out.println("arquivo criado: "+ arquivo);
        } catch (IOException e) {
             e.printStackTrace();
        }
    }
}
