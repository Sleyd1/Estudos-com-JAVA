package wnio;

import java.nio.file.Path;
import java.nio.file.Paths;
//sequência de diretórios
public class PathTest01 {
    public static void main(String[] args){
        Path p1 = Paths.get("C:\\Users\\wesle\\IdeaProjects\\Estudos-com-JAVA\\arquivoex\\file.txt");
        Path p2 = Paths.get("C:","\\Users\\wesle\\IdeaProjects\\Estudos-com-JAVA\\arquivoex","file.txt");
        Path p3 = Paths.get("C:\\Users\\wesle\\IdeaProjects\\Estudos-com-JAVA\\arquivoex","file.txt");
        Path p4 = Paths.get("C:","Users","wesle","IdeaProjects","Estudos-com-JAVA","arquivoex","file.txt");
        System.out.println(p1.getFileName());
        System.out.println(p2.getFileName());
        System.out.println(p3.getFileName());
        System.out.println(p4.getFileName());
    }
}
