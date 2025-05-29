package trabalhandocomobj2.getset;

public class Exemplo {
    private String nome;
    private int cpf;
    private int idade;





    //Sobrecarga de construtores
    public Exemplo(String nome, int cpf){
        this();
        this.nome = nome;

        this.cpf = cpf;


    }


    public Exemplo(String nome, int cpf, int idade){
        this(nome, cpf);
        this.idade = idade;

    }




    public Exemplo(){
        System.out.println("Ola, mundo");
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.idade);

    }



    //Sobrecarga de métodos
    public void init(String nome, int cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void init(String nome, int cpf, int idade) {
        this.init(nome,cpf);
        this.idade = idade;
    }

    public void imprimir(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.idade);
    }

    //set get

    public void setNome (String nome){
    this.nome = nome;

    }

    public void setCPF (int cpf){
    this.cpf = cpf;
    }

    public String getNome(){
        return nome;
    }

    public int getCpf(){
        return cpf;
    }


}
