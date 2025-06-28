package Excecoes.runtime;

public class RuntimeEx {
    public static void main(String[] args) {
        // Checket e UnChecket

        /*Principais runtimeException
        * NullPointerException
        * NumberFormatException
        * ClassCastException
        * IndexOutOfBoundsException
        * */

        int[] tins = new int[]{1,2,4};
        System.out.println(tins[3]);// ArrayIndexOutOfBoundsException

    }
}
