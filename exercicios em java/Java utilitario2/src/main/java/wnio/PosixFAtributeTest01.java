package wnio;


import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.*;
import java.util.Set;

public class PosixFAtributeTest01 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("arquivoex/subs/subs1/subs2/file_name.txt");

        // Verifica se o FileSystem suporta atributos POSIX
        if (!Files.getFileStore(path).supportsFileAttributeView(PosixFileAttributeView.class)) {
            System.out.println("O sistema de arquivos não suporta atributos POSIX.");
            return;
        }

        PosixFileAttributes posixF = Files.readAttributes(path, PosixFileAttributes.class);
        System.out.println("Permissões atuais: " + posixF.permissions());

        PosixFileAttributeView fileAttributeV = Files.getFileAttributeView(path, PosixFileAttributeView.class);
        Set<PosixFilePermission> posixFilePermissions = PosixFilePermissions.fromString("rw-rw-r--");
        fileAttributeV.setPermissions(posixFilePermissions);

        System.out.println("Permissões atualizadas: " + fileAttributeV.readAttributes().permissions());
    }
}
