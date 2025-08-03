package exemple2;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashmapTest01 {
    public static void manageWarehouse(HashMap<String, Integer> warehouse, String[] operations) {
        for (String operation : operations) {
            String[] parts = operation.split(" ");
            String command = parts[0];
            String product;

            if (command.equals("ADD")) {
                product = parts[1];
                int addQuantity = Integer.parseInt(parts[2]);
                warehouse.put(product, warehouse.getOrDefault(product, 0) + addQuantity);
            } else if (command.equals("REMOVE")) {
                product = parts[1];
                int removeQuantity = Integer.parseInt(parts[2]);
                if (warehouse.containsKey(product)) {
                    int updatedQuantity = warehouse.get(product) - removeQuantity;
                    if (updatedQuantity > 0) {
                        warehouse.put(product, updatedQuantity);
                    } else {
                        warehouse.remove(product);
                    }
                }
            } else if (command.equals("CHECK")) {
                product = parts[1];
                System.out.println(warehouse.containsKey(product));
            } else if (command.equals("PRINT")) {
                for (Map.Entry<String, Integer> entry : warehouse.entrySet()) {
                    System.out.println("Product: " + entry.getKey() + ", Quantity: " + entry.getValue());
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> warehouse = new HashMap<>();

        System.out.println("Digite o estado inicial do armazém (ex: Apple 10 Banana 5):");
        String initialWarehouseInput = scanner.nextLine();
        String[] initialProducts = initialWarehouseInput.split(" ");
        for (int i = 0; i < initialProducts.length; i += 2) {
            String product = initialProducts[i];
            int quantity = Integer.parseInt(initialProducts[i + 1]);
            warehouse.put(product, quantity);
        }

        System.out.println("Digite as operações (uma por linha). Digite 'DONE' para finalizar:");
        StringBuilder operationsInput = new StringBuilder();
        String line;
        while (!(line = scanner.nextLine()).equals("DONE")) {
            operationsInput.append(line).append("\n");
        }

        String[] operations = operationsInput.toString().split("\n");

        manageWarehouse(warehouse, operations);


        /* Exemplo de uso : Apple 10 Banana 5 Orange 20
        * ADD Apple 5
          REMOVE Banana 2
          CHECK Orange
          PRINT
          DONE
        * */
    }
}
