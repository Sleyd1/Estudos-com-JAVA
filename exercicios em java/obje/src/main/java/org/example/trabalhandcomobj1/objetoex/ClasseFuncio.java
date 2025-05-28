package org.example.trabalhandcomobj1.objetoex;

import org.example.trabalhandcomobj1.objetoex.objetoex.Funcionario;
public class ClasseFuncio {
    public static void main(String[] args){
        Funcionario funcionario1 = new Funcionario();
        funcionario1.nome = "Carlos";
        funcionario1.idade = 45;
        funcionario1.salario = 1500;
        funcionario1.medisalario = new float[]{100, 5000,300};

        Funcionario funcionario2 = new Funcionario();
        funcionario2.nome = "Manuel";
        funcionario2.idade = 30;
        funcionario2.salario = 1700;

        Funcionario funcionario3 = new Funcionario();
        funcionario3.nome = "hillary";
        funcionario3.idade = 25;
        funcionario3.salario = 1900;

        funcionario1.dadosImprimir();

        System.out.println("---------------------");
        System.out.println(funcionario1.salriofunci());

        System.out.println("Media Salarial dos funcionarios: "+ funcionario1.mediaSalario(funcionario3.salario,funcionario2.salario,funcionario1.salario));
        //impressora.dadosImprimir(funcionario1);
    }
}
