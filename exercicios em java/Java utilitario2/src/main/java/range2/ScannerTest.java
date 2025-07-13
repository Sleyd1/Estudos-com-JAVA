package range2;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        String text = "Levi,yago,bernado";
        Scanner entrada = new Scanner(text);
        entrada.useDelimiter(",");

        while (entrada.hasNext()){

            if (entrada.hasNextInt()){
                int i = entrada.nextInt();
                System.out.println("Int "+ i);
            }
            else if (entrada.hasNextBoolean()) {
                boolean b = entrada.nextBoolean();
                System.out.println("boolean "+ b);
            }
            else {
                System.out.println(entrada.next());
            }


        }
    }
}
