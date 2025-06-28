package Excecoes.runtimetest;

import java.io.FileNotFoundException;
import java.sql.SQLDataException;

public class MultExeceções {
    public static void main(String[] args) {
        test();

        try{
            //um metodo com mutiplasexceções deve ter varias catch informando todas elas
            exemplo2();
        }catch (SQLDataException e){
            e.printStackTrace();
            System.out.println("dentro do SQLDataException");
        }catch ( FileNotFoundException e){
            e.printStackTrace();
            System.out.println("dentro do FileNotFoundException");
        } finally {
            System.out.println("finalizado");
        }



    }

    public static void test(){
        try {
            throw new RuntimeException();
           // throw new ArrayIndexOutOfBoundsException();
           // throw new IllegalArgumentException();
        }catch (IllegalArgumentException e){
            System.out.println("dentro do IllegalArgumentException");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(" dentro do ArrayIndexOutOfBoundsException");
        } catch (RuntimeException e){
            System.out.println("dentro do RuntimeException");
        } finally {
            System.out.println("metodo finalizado");
            //o bloco finally sempre sera execurado
        }

    }

    public static void exemplo2() throws SQLDataException, FileNotFoundException{

    }
}
