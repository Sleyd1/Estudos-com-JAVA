package org.example;


//Classes locais
public class CassesL {
    private String nome = "Hello word!!";


    public void ex(){
        class LocalClass{
            public  void printLocal(){
                System.out.println(nome);
            }
        }

        new LocalClass().printLocal();

    }

    public static void main(String[] args) {
        CassesL ouuter = new CassesL();
        ouuter.ex();
    }
}
