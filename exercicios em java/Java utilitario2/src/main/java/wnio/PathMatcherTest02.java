package wnio;


import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.nio.file.FileSystems;

class ListAllF2 extends SimpleFileVisitor<Path>{

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes att){
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:*Test*.{class,java}");
        //qualquer coisa que termina com Test.java ou Test.class

        if (matcher.matches(file.getFileName())){
            System.out.println(file.getFileName());
        }

        return FileVisitResult.CONTINUE;
    }



}


public class PathMatcherTest02 {
    public static void main(String[] args) throws IOException {
        Path root = Paths.get(".");
        Files.walkFileTree(root,new  ListAllF2());


    }


}
