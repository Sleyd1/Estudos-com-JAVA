package wnio;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Objects;

class ListAllFi extends SimpleFileVisitor<Path>{



    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc)
            throws IOException
    {
        System.out.println( "Fil "+ file.getFileName());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs)
            throws IOException
    {
        System.out.println("Pre V "+ dir.getFileName());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc)
            throws IOException
    {
        System.out.println("Post V "+dir.getFileName());
       return FileVisitResult.CONTINUE
               ;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes att){
        if (file.getFileName().toString().endsWith(".java")){
            System.out.println(file.getFileName());
        }
        return FileVisitResult.CONTINUE;
    }




}

public class SimpleFileVisitor02 {
    public static void main(String[] args) throws IOException {
        Path root = Paths.get("arquivoex");
        Files.walkFileTree(root,new  ListAllFi());



    }


}
