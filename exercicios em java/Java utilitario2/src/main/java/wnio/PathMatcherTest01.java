package wnio;

import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.nio.file.FileSystems;


public class PathMatcherTest01 {
    public static void main(String[] args) {
        Path caminho1 = Paths.get("arquivoex/file2.txt");
        Path caminho2 = Paths.get("arquivoex/text.csv");

        matches(caminho1,"glob:*/*.txt");
        matches(caminho2, "glob:*/*.{txt,csv}");
        matches(caminho1, "glob:*/*file2.???");
        matches(caminho2, "glob:*/*.???");


    }

    public static void matches(Path path, String glob){
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob + ": "+ matcher.matches(path));
    }
}
