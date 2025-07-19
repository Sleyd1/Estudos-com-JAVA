package wnio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest02 {
    public static void main(String[] args) throws IOException {
        Path subpasta = Paths.get("C:\\Users\\wesle\\IdeaProjects\\Estudos-com-JAVA\\arquivoex","subs");
        if (Files.notExists(subpasta)){
            Path pastaDirectory = Files.createDirectory(subpasta);
        }
        Path subspastaPah = Paths.get("C:\\Users\\wesle\\IdeaProjects\\Estudos-com-JAVA\\arquivoex\\subs\\subs1\\subs2");
        Path subPastaD = Files.createDirectories(subspastaPah);
        Path filesP = Paths.get(subspastaPah.toString(),"file.txt");

        if (Files.notExists(filesP)){
            Path filesPathcreated = Files.createFile(filesP);
        }

        Path source = filesP;
        Path target = Paths.get(filesP.getParent().toString(), "file_name.txt");
        Files.copy(source,target, StandardCopyOption.REPLACE_EXISTING);
    }
}
