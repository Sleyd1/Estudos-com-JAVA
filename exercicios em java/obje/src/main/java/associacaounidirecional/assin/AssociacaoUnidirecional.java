package associacaounidirecional.assin;


//Associação unidirecional muitos para um
public class AssociacaoUnidirecional {
    private String nome;
    private Associacaoum[] professor;


    public void imprimir() {
        System.out.println(this.nome);
        if (professor == null) {
            return;
        }
        for (Associacaoum prof : professor){
            System.out.println(prof.getProfessor());
        }
    }

    public AssociacaoUnidirecional(String nome){
        this.nome = nome;
    }

    public AssociacaoUnidirecional(String nome,Associacaoum... professor ){
        this.nome = nome;
        this.professor = professor;
    }

    public void setNome(String nome) {
            this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Associacaoum[] getProfessor() {
            return professor;
    }






}
