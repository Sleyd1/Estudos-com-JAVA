package org.example;

import java.util.Locale;
import java.util.ResourceBundle;

//ResourceBundle
public class Main {
    public static void main(String[] args) {
        Locale localEn = new Locale("en", "US");
        Locale local = Locale.getDefault();
        System.out.println(Locale.getDefault());
        ResourceBundle guardar = ResourceBundle.getBundle("lingua", local);
        ResourceBundle guardaren = ResourceBundle.getBundle("lingua",localEn);
        //O arquivo .properties precisa estar no mesmo diretório do .class ou
        // em um diretório que esteja no classpath.
        //Se você está usando Maven ou Gradle ex:
        // src/main/resources/lingua_pt_BR.properties
        System.out.println(guardar.getString("Ola"));
        System.out.println(guardaren.getString("hello"));


    }
}