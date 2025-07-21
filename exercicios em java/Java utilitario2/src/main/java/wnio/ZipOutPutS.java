package wnio;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class ZipOutPutS {
    public static void main(String[] args) {
        Path arquivoz = Paths.get("arquivoex/subs/subs1/arquivo.zip");
        Path arquivosParaZipar = Paths.get("arquivoex/subs/subs1/subs2");

        zip(arquivoz,arquivosParaZipar);

    }
    private static void zip(Path arquivoz, Path arquivosParaZipar){
        try(ZipOutputStream zipStrream = new ZipOutputStream(Files.newOutputStream(arquivoz))){
            DirectoryStream<Path> dire = Files.newDirectoryStream(arquivosParaZipar);

            for (Path fie : dire){
                ZipEntry zipent = new ZipEntry(fie.getFileName().toString());
                zipStrream.putNextEntry(zipent);
                Files.copy(fie, zipStrream);

                zipStrream.closeEntry();
                System.out.println("Arquivo zip criado!");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
