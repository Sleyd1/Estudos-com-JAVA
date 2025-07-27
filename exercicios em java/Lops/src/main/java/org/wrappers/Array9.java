package org.wrappers;

import java.util.Scanner;

public class Array9 {
    public static void main ( String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int n = entrada.nextInt();
        System.out.println();

        int y = n;
        // Write your code below
        for (int i = 1 ;i < n; i++){
            y--;
            int soma = i + y;

            System.out.printf("%d + %d = %d\n",i,y,soma);

        }
        entrada.close();




    }

}
