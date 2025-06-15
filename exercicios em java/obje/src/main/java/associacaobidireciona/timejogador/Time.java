package associacaobidireciona.timejogador;

public class Time {
    private String nome;
    private Jogador[] jogadores;

    public Time(String nome, Jogador... jogadores){
        this.nome = nome;
        this.jogadores = jogadores;

    }
    public Time(String nome) {
        this.nome = nome;
    }

    public void setNome (String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void imprimir(){
        System.out.println("--Time--");
        System.out.println(getNome());
        for (Jogador jogaodr : jogadores){
            System.out.println(jogaodr.getNome());
        }


    }

}
