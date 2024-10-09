package calc;

import java.io.Console;

public class CalculatorMark2 {

    public static final int CMD_POS = 0;

    public static void main(String[] args) {

        float acc = 0;

        boolean stop = false;
    
        Console cons = System.console();

        while (!stop) {

            //Read a line and trims it
            //Add 1 2 3, BRK
            String cmd = cons.readLine("CMD>").trim();

            //Split up into terms
            String[] terms = cmd.split(" ");
        
            switch(terms[CMD_POS].toUpperCase()){

                //Add 6 7 8 9
                case "ADD":
                    for (int idx = 1; idx < terms.length; idx++) {
                        acc += Float.parseFloat(terms[idx]);
                    }
                    break;

                case "SUB":
                    for (int idx = 1; idx < terms.length; idx++) {
                    acc -= Float.parseFloat(terms[idx]);
                    }
                    break;

                case "MUL":
                    for (int idx = 1; idx < terms.length; idx++) {
                    acc *= Float.parseFloat(terms[idx]);
                    }
                    break;

                case "DIV":
                    for (int idx = 1; idx < terms.length; idx++) {
                    acc /= Float.parseFloat(terms[idx]);
                    }
                    break;
                
                // initializes the accumulator to 0
                case "INIT":
                    acc = 0;
                    break;

                case "BRK":
                    stop = true;
                    break;

                case "SHOW":
                    System.out.printf("> %.3f\n", acc);
                    break;

                default:

    



            }
                


        }

    }

}
