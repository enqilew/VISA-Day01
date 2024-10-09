package calc;

import java.util.Scanner;

public class XCalculator {

    public static void main(String[] args) {

        // Declare an accumulator
        float acc = 0;
        float value = 0;
        boolean contin = true;

        // Use Scanner instead of Console
        Scanner scanner = new Scanner(System.in);

        while (contin) {
            // Read a line and trim it
            System.out.print("CMD> ");
            String cmd = scanner.nextLine().trim();

            switch (cmd.toUpperCase()) {
                case "ADD":
                    System.out.print("VAL> ");
                    cmd = scanner.nextLine().trim();
                    value = Float.parseFloat(cmd);
                    acc += value;
                    break;

                case "SUB":
                    System.out.print("VAL> ");
                    cmd = scanner.nextLine().trim();
                    value = Float.parseFloat(cmd);
                    acc -= value;
                    break;

                case "MUL":
                    System.out.print("VAL> ");
                    cmd = scanner.nextLine().trim();
                    value = Float.parseFloat(cmd);
                    acc *= value;
                    break;

                case "DIV":
                    System.out.print("VAL> ");
                    cmd = scanner.nextLine().trim();
                    value = Float.parseFloat(cmd);
                    acc /= value;
                    break;

                // Initialize the accumulator to 0
                case "INIT":
                    acc = 0;
                    break;

                case "BRK":
                    contin = false;
                    break;

                case "SHOW":
                    System.out.printf("> %.3f\n", acc);
                    break;

                default:
                    
            }
        }

        scanner.close();  // Close the scanner after use
    }
}
