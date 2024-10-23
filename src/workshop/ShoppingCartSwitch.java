package workshop;

import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class ShoppingCartSwitch {

    public static void main(String[] args) {

        boolean cont = true;
        Console cons = System.console();  // Get console instance
        List<String> cart = new ArrayList<>();

        System.out.printf("Welcome to your shopping cart.\n");

        while (cont) {

            String input = cons.readLine("What would you like to do?\n").trim();

            // Split input into words
            String[] terms = input.replace(",", "").split(" ");
            
            String command = terms[0].toUpperCase();  // First term as command

            switch (command) {

                case "LIST":
                    if (cart.isEmpty()) {
                        System.out.println("Your cart is empty.");
                    } else {
                        for (int idx = 0; idx < cart.size(); idx++) {
                            System.out.printf("%d. %s\n", idx + 1, cart.get(idx));
                        }
                    }
                    break;

                case "ADD":
                    if (terms.length < 2) {
                        System.out.println("No items to add.");
                    } else {
                        for (int idx = 1; idx < terms.length; idx++) {
                            String item = terms[idx];
                            if (cart.contains(item)) {
                                System.out.printf("You already have %s in your cart.\n", item);
                            } else {
                                cart.add(item);
                                System.out.printf("%s added to cart.\n", item);
                            }
                        }
                    }
                    break;

                case "DELETE":
                    if (cart.isEmpty()) {
                        System.out.println("Your cart is empty.");
                    } else if (terms.length < 2) {
                        System.out.println("No items to remove.");
                    } else {
                        try {
                            int itemIndex = Integer.parseInt(terms[1]) - 1;  // Convert to 0-based index
                            if (itemIndex >= 0 && itemIndex < cart.size()) {
                                String removedItem = cart.remove(itemIndex);
                                System.out.printf("%s removed from cart.\n", removedItem);
                            } else {
                                System.out.println("Invalid item index.");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Please enter a valid number.");
                        }
                    }
                    break;

                case "BREAK":
                    cont = false;
                    System.out.println("Exiting the shopping cart.");
                    break;

                default:
                    System.out.println("Invalid input.");
                    break;
            }
        }
    }
}
