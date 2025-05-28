package trabalhandocomobj2;

import trabalhandocomobj2.estudanteinf.EstudanteInformacoes;
import  trabalhandocomobj2.estudanteinf.ImpressoraEstudante;

public class Estudante {
    public static void main(String[] args){
        EstudanteInformacoes estudante = new EstudanteInformacoes();
        EstudanteInformacoes estudnade2 = new EstudanteInformacoes();

        ImpressoraEstudante imprimir = new ImpressoraEstudante();

        estudante.nome = "Junio";
        estudante.sexo = 'M';
        estudante.idade = 19;

        estudnade2.nome = "Manu";
        estudnade2.sexo ='F';
        estudnade2.idade = 20;


        imprimir.imprimindo(estudante);
        imprimir.imprimindo(estudnade2);

    }
}
