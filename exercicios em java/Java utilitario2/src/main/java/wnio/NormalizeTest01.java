package wnio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest01 {
    public static void main(String[] args) {
            String diretorioProjec = "C:\\Users\\wesle\\IdeaProjects\\Estudos-com-JAVA\\arquivoex\\subs\\subs1\\subs2";
            String arquivo = "../../../file.txt";
            Path directory = Paths.get(diretorioProjec, arquivo);

            System.out.println(directory);
            System.out.println(directory.normalize());
        System.out.println("\n---------------------------------------\n");
            Path path = Paths.get("/arquivoex/./subs/./subs1");
            System.out.println(path);
            System.out.println(path.normalize());

    }
}
