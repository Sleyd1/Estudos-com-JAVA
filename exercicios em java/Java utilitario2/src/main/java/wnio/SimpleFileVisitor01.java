package wnio;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class ListAllF extends SimpleFileVisitor<Path>{

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes att){
        /*if (file.getFileName().toString().endsWith("Test.java")){
            System.out.println(file.getFileName());
        }*/

        System.out.println(file.getFileName());
        return FileVisitResult.CONTINUE;
    }


}

public class SimpleFileVisitor01{
    public static void main(String[] args) throws IOException {
        Path root = Paths.get(".");
        Files.walkFileTree(root,new  ListAllF());


    }


}
