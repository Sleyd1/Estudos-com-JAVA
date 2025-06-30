package Excecoes.trywithresources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TryWithreSources {
    public static void main(String[] args) {


    }

    public  static void lerArquivo(){
        //try com recurso
            try(Reader reader = new BufferedReader(new FileReader("teste.txt"))){


            } //try com recursos pode ser usado sem o catch
    }


}
