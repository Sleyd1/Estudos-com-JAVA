package enumeracao.outrasclass;

public class Cliente {
    // Outro jeito de criar uma classe de numeração
    public enum TipoP {

    }

    /*------------------*/
    private String nome;
    private TipoCliente tipo;

    public Cliente(String nome, TipoCliente tipoCliente){
        this.nome = nome;
        this.tipo = tipoCliente;
    }

    private String comparar(){
        if (tipo == TipoCliente.CLIENTE_JURIDICO){
            return "Cliente juridico " + tipo;
        } else if (tipo == TipoCliente.CLIENTE_FISICA) {
            return "Cliente fisico " + tipo;
        } else {
            return null;
        }
    }

    public void exibir(){
        System.out.println(comparar());
    }


}
