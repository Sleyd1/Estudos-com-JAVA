package wnio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.*;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFilesAttributesTest02 {
    public static void main(String[] args) throws IOException {
        //BasicFileAttributes, DosFilesAttributes, PosixFileAttributes
        Path path = Paths.get("arquivoex/novo.txt");
        BasicFileAttributes basicf = Files.readAttributes(path, BasicFileAttributes.class);

        FileTime creaationTime = basicf.creationTime();
        FileTime lastModifiedTime = basicf.lastModifiedTime();
        FileTime lastAccesTime = basicf.lastAccessTime();

        System.out.println("tempo criado "+creaationTime);
        System.out.println("tempo modificação "+lastModifiedTime);
        System.out.println("tempo ultimo acesso "+lastAccesTime);
        System.out.println("\n----------------------------\n");

        BasicFileAttributeView basicff = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        FileTime newCreateTime = FileTime.fromMillis(System.currentTimeMillis());
        basicff.setTimes(lastModifiedTime,newCreateTime,creaationTime);

        System.out.println("Creation "+ creaationTime);
        System.out.println("LastMOdifieldtime "+ lastModifiedTime);
        System.out.println("LastAcesssTime "+ lastAccesTime);






    }
}
