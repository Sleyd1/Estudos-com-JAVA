package trabalhandocomobj2.blocodeinicializacao;



public class ExemploBloco {
    private int[] contador;
    // 1_ aloca espaço em memoria pro objeto
    // 2_ cada atributo de classe e inicializados com alores default ou os valores que for passada.
    // 3_ bloco de inicialização e executado
    // 4_ o contrutor e executado

    // bloco de inicalição
    {
        contador = new int[50];
        for (int c = 0; c < contador.length; c++){

                contador[c] = c+1;
        }

    }

    public ExemploBloco(){

    }

   public int[] getcontador(){
        return contador;
   }


}
