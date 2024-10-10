package workshop;

import java.io.Console;

public class ShoppingCart {

    public static void main(String[] args){

        boolean cont = true;
        Console cons = System.console();

        While (cont); {

            System.out.printf("Welcome to your shopping cart.\n ");

            String input = cons.readLine(">>>What would you like to do? (List, Add, Remove, Break)").trim();


            switch(input.toUpperCase()) {

                case "ADD":
                    String addInput = cons.readLine("How many items would you like to add to your cart?").trim();
                    
                    int addItem = Integer.parseInt(addInput);

                    String []cart = new String[addItem];

                    for (int idx = 0; idx < cart.length; idx++){
                        cart[idx] = cons.readLine("Add items %d: \n", idx+1);
                    }

                case "REMOVE":
                    for 

                    String[] terms = input.split(" ");

                case "LIST":
                    for (idx = 0; idx <= cart.length; idx++) {
                        System.out.printf("%d. %s\n", idx+1, cart[idx]);

                case "BREAK":
                        cont = false;
                        break;
                


        }





        String cart[] = new String[itemCount];

        for (int idx = 0; idx <= cart.length; idx++){
            cart[idx] = cons.readLine("Add item %d: ", idx+1);
        }


    }
    
}
