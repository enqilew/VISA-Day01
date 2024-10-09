package myapp;

import java.io.Console;

public class Greetings {

    public static void main (String[] args) {

        //Declare a variable of type Consoole and get the console
        Console cons = System.console();

        //Prompt the user for something, then result is assigned to the variable called input
        String input = cons.readLine("What is your name?");
        String input2 = cons.readLine("How old are you?");

        input = input.trim();
        input2 = input2.trim();
        
        //Convert string to int
        int age = Integer.parseInt(input2);

        //Print the input
        System.out.printf("Hello. You said '%s'. You also said this: %d\n", input, age);    

    }

}
