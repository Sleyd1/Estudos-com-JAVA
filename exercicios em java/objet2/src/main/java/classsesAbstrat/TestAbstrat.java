package classsesAbstrat;

import classsesAbstrat.outrasclasseAbst.Desenvolvedor;

public class TestAbstrat {
    public static void main(String[] args) {
        Desenvolvedor funcionario = new Desenvolvedor("Wesley",20000,"analise de Sistemas");

        funcionario.exibir();
        funcionario.imprimir();
        /*
        * Desenvolvedor subclasse da classe Funcionario erdou o metodo imprimir
        * */
    }
}
