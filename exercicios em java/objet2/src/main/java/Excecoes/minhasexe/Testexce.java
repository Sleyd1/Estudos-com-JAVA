package Excecoes.minhasexe;

import java.util.Scanner;

public class Testexce {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        }


    }
public static void logar() throws LoginInvalidoException {
    Scanner entrada = new Scanner(System.in);
    String nomeDeUsuario = "Carlos";
    int senhaPin = 19044;
    System.out.println("Digite seu nome de usuário abaixo");
    String DigiteUsuario = entrada.nextLine();
    System.out.println("digite sua senha de usuário abaixo");
    int DigiteSenha = entrada.nextInt();

    if (!DigiteUsuario.equals(nomeDeUsuario) || DigiteSenha != senhaPin){
        throw new LoginInvalidoException("Erro no login. senha ou nome de usuário invalidos");
    }

    System.out.println("Usuário logado");


}




}
