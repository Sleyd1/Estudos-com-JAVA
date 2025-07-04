package Excecoes.trywithresources;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class TryWithreSources {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        String s1 = sc.next();
        int x = sc.nextInt();

        String s2 = sc.next();
        int x2 = sc.nextInt();

        String s3 = sc.next();
        int x3 = sc.nextInt();

        System.out.println("================================");

        System.out.printf("%-15s %03d\n", s1, x);
        System.out.printf("%-15s %03d\n", s2, x2);
        System.out.printf("%-15s %03d\n", s3, x3);


        System.out.println("================================");


    }


    public static void lerArquivo() throws IOException {
        //try com recurso
        try (Reader reader = new BufferedReader(new FileReader("teste.txt"))) {


        } //try com recursos pode ser usado sem o catch



    }

}

