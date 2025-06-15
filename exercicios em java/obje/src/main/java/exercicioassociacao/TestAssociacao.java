package exercicioassociacao;

import exercicioassociacao.codios.Aluno;
import exercicioassociacao.codios.Local;
import exercicioassociacao.codios.Professor;
import exercicioassociacao.codios.Seminario;

public class TestAssociacao {
    public static void main(String[] args) {
        Local localidade = new Local("rua argemiro");
        Aluno aluno1 = new Aluno("eduardo");
        Aluno alnuo2 = new Aluno("julia");
        aluno1.setIdade(18);
        alnuo2.setIdade(18);
        Aluno[] alunos = {aluno1,alnuo2};

        Seminario seminario1 = new Seminario("educação financeira", localidade, alunos);
        Seminario seminario2 = new Seminario("blabla");
        Seminario[] seminarios = {seminario1, seminario2};


        Professor professor = new Professor("rafael", "portugues");
        professor.setSeminario(seminarios);



        aluno1.setSeminario(seminario1);
        alnuo2.setSeminario(seminario1);



        professor.imprimir();
        seminario1.imprimir();
        aluno1.imprimir();




    }
}
