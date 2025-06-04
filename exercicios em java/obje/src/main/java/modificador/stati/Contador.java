package modificador.stati;
// bloco de inicialização estatico
public class Contador {
    public static int[] contar;
    public int[] contando;
    //
     //
     //
     //



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
