package wnio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileAttributeTest {
    public static void main(String[] args) throws IOException {
        //BasicFileAttributes, DosFilesAttributes, PosixFileAttributes
        LocalDateTime date = LocalDateTime.now().minusDays(10);
        File file = new File("arquivoex/novo.txt");
        boolean isCreated = file.createNewFile();
        boolean isModified = file.setLastModified(date.toInstant(ZoneOffset.UTC).toEpochMilli());

        Path path = Paths.get("arquivoex/novo_path.txt");
        Files.createFile(path);
        FileTime fileT = FileTime.from(date.toInstant(ZoneOffset.UTC));
        Files.setLastModifiedTime(path, fileT);
        System.out.println(Files.isWritable(path));
        System.out.println(Files.isRegularFile(path));
        System.out.println(Files.isExecutable(path));


    }
}
