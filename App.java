
        /*
            1. select an operator
            2. ask for & validate input
            3. calculate result
            4. show result
            5. wipe or save result
        */

import java.util.Scanner;

public class App {

    public static void main(String[] args){
        System.out.println("Simple Calculator \n by albertofp");
        System.out.println("\n\n");
        Scanner input = new Scanner(System.in);

        System.out.println("[1] Addition \n");
        System.out.println("[2] Subtraction \n");
        System.out.println("[3] Multiplication \n");
        System.out.println("[4] Division \n");
        System.out.println("[5] Celsius/Fahrenheit converter \n");
        System.out.println("[6] Exit calculator \n");
        int functionSelection = input.nextInt();

        do {
            System.out.println("Select the number of the function you want to use\n");

            
            while((!input.hasNextInt()) || functionSelection > 6 || functionSelection < 0 ) {
                System.out.println("Error! Please select one of the options above.");
                input.next();
            }
        } while (functionSelection <= 0);
        System.out.println(functionSelection); //for debugging only

    }

}