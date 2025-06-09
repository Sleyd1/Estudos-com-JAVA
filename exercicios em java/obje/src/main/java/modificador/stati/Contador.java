package modificador.stati;
// bloco de inicialização estatico
public class Contador {
    public static int[] contar;
    public int[] contando;
     // 0_ Bloco de inicialização é executado quando a jvm carregar a classe.
     // 1_ alocado espaço em memória para o projeto.
     // 2_ cada atributo de classe e inicializados com alores default ou os valores que for passada.
     // 3_ bloco de inicialização e executado.
     // 4_ o contrutor e executado.




    static {
        System.out.println("bloco de inicialização");
        contar = new int[100];
        for (int u : contar){
            contar[u]= u+1;
            System.out.println(contar[u] + " ");
        }
    }

    public Contador(int numero){
        contando = new int[numero];
        for (int u : contando){
            contando[u]= u+1;

        }
    }

    public void imprimir(){
        for (int u : contando){
            contando[u]= u+1;
            System.out.print(u + " ");
        }


    }













}
