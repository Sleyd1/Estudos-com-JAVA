package Excecoes.exercicios;

import java.util.Scanner;

//Objetivo: Entender try-catch e ArithmeticException
public class DivisaoSegura {

    public static void main(String[] args) {
        Scanner entradaPergunta = new Scanner(System.in);
        Scanner entrada = new Scanner(System.in);
        int numero, numero2 = 0;
        int resultado = 0;

        System.out.println("Divisão de numero inteiros");
        while (true){

            System.out.println("Digite o numero que será dividido: ");
            numero = entrada.nextInt();

            System.out.println("Digite o número que sera divisor: ");
            numero2 = entrada.nextInt();

            if (numero == 0 && numero2 == 0){
                System.out.println("resultado: " + resultado);
                break;
            }

            try {
                resultado = dividir(numero, numero2);
                System.out.println("Resultado: " + resultado);
                break;
            } catch (ArithmeticException e) {
                System.out.println("Erro: " + e.getMessage());
                System.out.println("Por favor, tente novamente.");
            }

        }
        entrada.close();



    }

    public static int dividir(int valor1, int valor2){
        if (valor2 == 0) {
            throw new ArithmeticException("Não é possível dividir por zero.");
        }
        return valor1 / valor2;
    }


}



