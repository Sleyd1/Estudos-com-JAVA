package trabalhandocomobj2;

import trabalhandocomobj2.getset.Exemplo;

public class TestePriv {
    public static void main(String[] args){
        Exemplo carat = new Exemplo("wesley", 123456789,18);
        Exemplo carat2 = new Exemplo();

      //  carat.setNome("juliano");
      //  carat.setCPF(123456789);


        carat.imprimir();

     //   System.out.println("--------------------");
     //   System.out.println(carat.getNome());
     //   System.out.println("---------------------");

     //   carat.init("Thais",123456789, 18);
     //   carat.imprimir();





        /*
        * A sobrecarga de métodos (method overloading) em Java é um recurso que permite que uma classe tenha vários
        * métodos com o mesmo nome, mas com assinaturas diferentes. Isso significa que os métodos sobrecarregados devem diferir
        * em pelo menos um dos seguintes aspectos:
          Número de parâmetros: Os métodos podem ter um número diferente de parâmetros.

          Tipo dos parâmetros: Os métodos podem ter tipos de parâmetros diferentes.

          Ordem dos parâmetros: A ordem dos tipos de parâmetros pode variar.


        *
        *
        * */

    }
}
