package file;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("arquivoex\\file2.txt");
        try {
            boolean iscreated = file.createNewFile();
            System.out.println(iscreated);

            System.out.println("path"+ file.getPath());
            System.out.println("path absolute "+file.getAbsolutePath());
            System.out.println("is directory "+file.isDirectory());
            System.out.println("is file "+ file.isFile());
            System.out.println("is hidden "+ file.isHidden());
            System.out.println("last modified "+ Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()));


            boolean existe = file.exists();
            if (existe){
                System.out.println("arquivo existe: "+ existe);
                System.out.println("deletado "+ file.delete());
            }

        } catch (IOException e) {
           e.printStackTrace();
        }

    }
}
