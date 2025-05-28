package org.example.trabalhandcomobj1.objetoex.objetoex;

public class Funcionario {
    public String nome;
    public int idade;
    public float salario;
    public float[] medisalario;

    public void dadosImprimir(){
        System.out.println("Nome: "+ nome);
        System.out.println("idade: "+ idade);
        System.out.println("Salario: "+ salario);
    }

    public float mediaSalario(float... numero){
        float total = 0;
        for (float num : numero){
            total += num;
        }

        return total/ numero.length;

    }

    public float salriofunci(){
        float mendi = 0;
        for (float numb : medisalario){
            mendi += numb;
        }
        return mendi/ medisalario.length;
    }
}
