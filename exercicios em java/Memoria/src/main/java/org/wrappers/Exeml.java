package org.wrappers;

//Como saber quanto espaço em memória um programa Java está usando?
public class Exeml {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();

        long memoriaTotal = runtime.totalMemory();
        long memoriaLivre = runtime.freeMemory();
        long memoriaUsada = memoriaTotal - memoriaLivre;

        System.out.println("Memória total: " + memoriaTotal);
        System.out.println("Memória livre: " + memoriaLivre);
        System.out.println("Memória usada: " + memoriaUsada);





    }
}
