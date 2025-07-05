package org.wrappers;
//Arrays Multidimensionais
public class ArrayM {
    public static void main(String[] args){
        int[][] dias = new int[3][3];
        dias[0][0] = 31;
        dias[0][1] = 20;
        dias[0][2] = 40;
        dias[1][0] = 10;
        dias[1][1] = 15;
        dias[1][2] = 25;
        dias[2][0] = 35;
        dias[2][1] = 45;
        dias[2][2] = 55;

        for (int i = 0; i < dias.length; i++){
            for (int j = 0; j < dias[i].length; j++){
                System.out.println(dias[i][j]);
            }
        }

        System.out.println("-----------------------------");

        for (int[] arr: dias){
            for (int num: arr){
                System.out.println(num);
            }
        }

        int[][] num = new int[3][];
        num[0] =  new int[4];
        num[1] = new int[3];
        num[2] = new int[6];

    System.out.println("--------------");
        for (int[] atbm: num){
            for (int nove: atbm) {
                System.out.println(nove);

            }
        }



        String[] nomes = new String[3];
        nomes[0] = "wesley";
        nomes[1] = "junio";
        System.out.println(nomes[0]);
        nomes = new String[3];
        System.out.println(nomes[0]);
    }
}
