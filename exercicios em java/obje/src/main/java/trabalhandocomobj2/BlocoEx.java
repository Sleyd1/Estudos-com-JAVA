package trabalhandocomobj2;

import  trabalhandocomobj2.blocodeinicializacao.ExemploBloco;

public class BlocoEx {
    public static void main(String[] args){
         ExemploBloco conte = new ExemploBloco();

        for (int contar : conte.getcontador()){
            System.out.println(contar);
        }

    }
}
