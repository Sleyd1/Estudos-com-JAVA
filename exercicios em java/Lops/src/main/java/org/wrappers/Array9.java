package org.wrappers;

import java.util.Scanner;
public class Array9 {
    public static void main ( String[] args){
       /* Scanner entrada = new Scanner(System.in);
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
*/

/*
        int[][] jaggedArray = new int[5][];

        for (int i = 0; i < jaggedArray.length; i++) {
            jaggedArray[i] = new int[i + 1];

            for (int j = 0; j < jaggedArray[i].length; j++) {
                jaggedArray[i][j] = (i + 1) * (j + 1);

                System.out.print(jaggedArray[i][j]+ ", ");
            }

*/


        int[][] jaggedArray = {{1, 2, 3, 4}, {5, 6, 7, 8},
                {9, 10, 11, 12}, {13, 14, 15, 16}};

        int size = jaggedArray.length;
        int size2 = jaggedArray[0].length;
        System.out.print("Main Diagonal: ");
       // for (int i = 0; i < jaggedArray.length; i++) {

            //System.out.print(jaggedArray[i][i]+"/\\");

            //System.out.print("// "+ jaggedArray[i][size - 1 - i] +" \\");
           // System.out.print("// "+ jaggedArray[i][0] +" \\");

       // }

        System.out.print("Main Diagonal: ");
        for(int i = 0; i < jaggedArray.length; i++){

            System.out.print(jaggedArray[i][i] + " ");
        }

        System.out.print("\nAnti-Diagonal: ");
        for(int i = 0; i < jaggedArray.length; i++){

            System.out.print(jaggedArray[i][size - 1 -i] + " ");
        }

        System.out.print("\nTop Border: ");
        for(int i = 0; i < jaggedArray.length; i++){

            System.out.print(jaggedArray[0][i] +" ");
        }

        System.out.print("\nTop Border: ");
        for(int i = 0; i < jaggedArray.length; i++){

            System.out.print(jaggedArray[size - 1][i] +" ");
        }

        System.out.print("\nLeft Border: ");
        for(int i = 0; i < jaggedArray.length; i++){

            System.out.print(jaggedArray[i][0] +" ");
        }

        System.out.print("\nRight Border: ");
        for(int i = 0; i < jaggedArray.length; i++){

            System.out.print(jaggedArray[i][size - 1] +" ");
        }


    }

}
