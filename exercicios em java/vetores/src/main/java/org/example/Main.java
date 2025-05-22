package org.example;
import java.util.ArrayList;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Inicialização direta: Atribuir valores diretamente
        int[] valores = {1, 5, 9, 4, 8}; // Array com 5 elementos
        /* os colhetes na frente do tipo indica q a
        varavel vai armazenar multiplo valores.
         */

        /* Tambem podemos definir variaveis arreys com o
        tamanho ja definidas mas com nenhum valor armazenados.
         */
        int[] expl = new int[5]; // // Array com 5 posições (índices 0 a 4)
        //Tamanho fixo: Você pode criar um array com um tamanho definido usando "new".
        /*
        * É importante relsaltar que q esses tipos de vetores sao fixos
        * se todos os espaços estiverem armazenando valores nao podemos adicionar mais
        * um espaço com valor.
        * */
        System.out.println("Total de valores armazenados no vetor: " + expl.length);
        //Propriedade length
        //Retorna o tamanho do array.
        System.out.println(valores[2]);

        /*
        *Arrayslist sao uma classe em java q nos permite emplentar uma
        * lista dinamica de elementos
        *
        *uma lista dinamica nos permite adicionar e remover elementos de forma
        * dinamica sem prescisar declarar o tamanho q uma variavel arrey vai ter
        *
        *para podermos utilizar a classe ArrayList primeiro devemos importar
        * ela do java "import java.util.ArrayList;"
        *
        * uma classe representar uma estretura de dados
        *
        *
        *  */
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Wesley");
        nomes.add("fernanda");
        nomes.add("eduardo");
        nomes.add("arthur");
        nomes.remove(0);

        /*
        * .add: adiciona elementos
        *.remove: remove elementos
        *
        * */

        System.out.println(nomes.get(0));
        System.out.println("total de nomes armazenados: " + nomes.toArray().length);

        }
    }
