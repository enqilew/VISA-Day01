package workshop;

import java.util.ArrayList;

public class ShoppingCart {
    
    private ArrayList<String> cart;

    // Constructor to initialize the cart
    public ShoppingCart() {
        cart = new ArrayList<>();
    }

    // Method to add items to the cart
    public void addItems(String items) {
        String[] itemArray = items.split(",\\s*");
        for (String item : itemArray) {
            if (cart.contains(item)) {
                System.out.println("You have " + item + " in your cart");
            } else {
                cart.add(item);
                System.out.println(item + " added to cart");
            }
        }
    }

    // Method to list items in the cart
    public void listItems() {
        if (cart.isEmpty()) {
            System.out.println("Your cart is empty");
        } else {
            for (int i = 0; i < cart.size(); i++) {
                System.out.println((i + 1) + ". " + cart.get(i));
            }
        }
    }

    // Method to delete an item from the cart
    public void deleteItem(int index) {
        if (index > 0 && index <= cart.size()) {
            System.out.println(cart.get(index - 1) + " removed from cart");
            cart.remove(index - 1);
        } else {
            System.out.println("Incorrect item index");
        }
    }
}
