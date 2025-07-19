package wnio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

public class DosFileAttrisbutesTest01 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("arquivoex/file.txt");

        if(Files.notExists(path)) Files.createFile(path);

        DosFileAttributes dosF = Files.readAttributes(path, DosFileAttributes.class);
        System.out.println(dosF.isHidden());
        System.out.println(dosF.isReadOnly());


        DosFileAttributeView fileA = Files.getFileAttributeView(path, DosFileAttributeView.class);
        fileA.setHidden(true);
        fileA.setReadOnly(true);
        System.out.println(fileA.readAttributes().isHidden());
        System.out.println(fileA.readAttributes().isReadOnly());

    }

}
