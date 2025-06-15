package associacaobidireciona.timejogador;

public class Jogador {
    private String nome;
    private Time time;

    public Jogador (String nome){
        this.nome = nome;
    }

    public Jogador (String nome, Time time){
        this.nome = nome;
        this.time = time;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public void imprimir(){
        System.out.println("---jogaodor---");
        System.out.println(getNome());
        System.out.println(getTime());
    }


}
