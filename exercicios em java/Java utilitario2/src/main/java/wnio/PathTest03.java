package wnio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest03 {
    public static void main(String[] args) {
        Path  dir = Paths.get("arquivoex/subs");
        Path clazz = Paths.get("arquivoex/subs/subs1/subs2");
        Path pathToClazz = dir.relativize(clazz);
        System.out.println(pathToClazz);

        Path absoluto = Paths.get("/arquivoex/subs");
        Path absoluto2 = Paths.get("/subs1/subs2");
        Path absoluto3 = Paths.get("/arquivoex/subs/subs1/subs2/file.txt");
        Path relativo = Paths.get("subs2");
        Path relativo2 = Paths.get("subs2/file.txt");

        System.out.println(absoluto.relativize(absoluto3));
        System.out.println(absoluto3.relativize(absoluto));
        System.out.println(absoluto.relativize(absoluto2));
        System.out.println(relativo.relativize(relativo2));

    }
}
