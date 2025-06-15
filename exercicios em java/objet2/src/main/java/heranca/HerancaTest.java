package heranca;

import heranca.extend.Endereco;
import heranca.extend.Funcionario;
import heranca.extend.Pessoa;

public class HerancaTest {
    public static void main(String[] args) {
        Pessoa info = new Pessoa("Marcos",123456789);
        Endereco endereco = new Endereco();
        endereco.setRua("marlon augusto");
        endereco.setCep("134443222");
        info.setEndereco(endereco);
        info.exibir();



        Funcionario funcionario = new Funcionario(2000.60);
        funcionario.setCpf(345678);
        funcionario.setNome("marlon");
        funcionario.setEndereco(endereco);
        funcionario.exibir();


    }
}
