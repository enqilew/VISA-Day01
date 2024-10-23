package workshop;

//import java.io.Console;
import java.util.Scanner;

public class ShoppingCartMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Using Scanner for input
        ShoppingCart cart = new ShoppingCart(); // Create an instance of the ShoppingCart class

        System.out.println("Welcome to your shopping cart");

        // Main loop to handle user input
        while (true) {
            System.out.print("> "); // Prompt for input
            String input = scanner.nextLine().trim(); // Read the input inside the loop

            String[] terms = input.replace(",", "").split(" ");
            String command = terms[0].toLowerCase(); // Extract the command

            if (command.equals("list")) {
                cart.listItems(); // Call method from ShoppingCart class
            } else if (command.startsWith("add ")) {
                String items = input.substring(4); // Extract items after 'add '
                cart.addItems(items); // Call method from ShoppingCart class
            } else if (command.startsWith("delete ")) {
                try {
                    int index = Integer.parseInt(input.substring(7).trim()); // Extract index
                    cart.deleteItem(index); // Call method from ShoppingCart class
                } catch (NumberFormatException e) {
                    System.out.println("Please provide a valid item index");
                }
            } else if (command.equals("exit")) { // Option to exit the loop
                System.out.println("Exiting... Goodbye!");
                break;
            } else {
                System.out.println("Unknown command. Use 'list', 'add', 'delete', or 'exit'.");
            }
        }

        scanner.close(); // Close the scanner to avoid resource leaks
    }
}

// public class ShoppingCartMain {

//     public static void main(String[] args) {
//         Console cons = System.console();
//         String input = cons.readLine("Welcome to your shopping cart\n").trim();

//         String[] terms = input.replace(",", "").split(" ");

//         String command = terms[0].toLowerCase();
//         // Create an instance of the ShoppingCart class
//         ShoppingCart cart = new ShoppingCart();

//         // System.out.println("Welcome to your shopping cart");

//         // Main loop to handle user input
//         while (true) {
//             // System.out.print("> ");
//             // input = scanner.nextLine().trim().toLowerCase();

//             if (command.equals("list")) {
//                 cart.listItems(); // Call method from ShoppingCart class
//             } else if (command.startsWith("add ")) {
//                 String items = input.substring(4); // Extract items after 'add '
//                 cart.addItems(items); // Call method from ShoppingCart class
//             } else if (command.startsWith("delete ")) {
//                 try {
//                     int index = Integer.parseInt(input.substring(7).trim()); // Extract index
//                     cart.deleteItem(index); // Call method from ShoppingCart class
//                 } catch (NumberFormatException e) {
//                     System.out.println("Please provide a valid item index");
//                 }
//             } else {
//                 System.out.println("Unknown command. Use 'list', 'add', or 'delete'.");
//                 break;
//             }
//         }
//     }
// }
