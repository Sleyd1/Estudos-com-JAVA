package modificador.stati;
// utilizando o Modificador static
public class LimiteDeV {
    private String nome;
    private double velocidadeMaxima;
    public static double velocidadeLimite = 200;

    public LimiteDeV(String nome, double velocidadeMaxima){
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void setNome(String nome){
        this.nome = nome;

    }

    public void setVelocidadeMaxima(double velocidadeMaxima){
        this.velocidadeMaxima = velocidadeMaxima;

    }

    public void VelocidadeLimite(double velocidadeLimite){
        this.velocidadeLimite = velocidadeLimite;
    }

    public String getNome(){
        return nome;
    }

    public double getVelocidadeMaxima(){
        return velocidadeMaxima;

    }

    public void getImprime(){
        System.out.println(nome);
        System.out.println(velocidadeMaxima);
        System.out.println(LimiteDeV.velocidadeLimite);
    }





}
