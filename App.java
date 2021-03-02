
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
        int functionSelection;

        System.out.println("Simple Calculator \n by albertofp");
        System.out.println("\n\n");
        System.out.println("Select the function you want to use\n");
        Scanner input = new Scanner(System.in);

        System.out.println("[1] Addition \n");
        System.out.println("[2] Subtraction \n");
        System.out.println("[3] Multiplication \n");
        System.out.println("[4] Division \n");
        System.out.println("[5] Celsius/Fahrenheit converter \n");
        System.out.println("[6] Exit calculator \n");
        functionSelection = input.nextInt();
        System.out.println("Input : " + functionSelection);
        do {
            
            while((!input.hasNextInt()) || functionSelection > 6 || functionSelection < 0 ) {
                System.out.println("Error! Please select one of the options above.");
                functionSelection = 0;
                input.next();
            }

        } while (functionSelection == 7);
        System.out.println(functionSelection); //for debugging only

        switch(functionSelection){
            case 1:
                System.out.println("Select the first number:");
                int add1 = input.nextInt();
                System.out.println("Select the second number:");
                int add2 = input.nextInt();

                System.out.println("Result :" + CalcFunctions.Add(add1,add2));
                break;

            case 2:
                System.out.println("Select the first number:");
                int sub1 = input.nextInt();
                System.out.println("Select the second number:");
                int sub2 = input.nextInt();

                System.out.println("Result :" + CalcFunctions.Subtract(sub1,sub2));
                break;
            
            case 3:
                System.out.println("Select the first number:");
                int mult1 = input.nextInt();
                System.out.println("Select the second number:");
                int mult2 = input.nextInt();

                System.out.println("Result :" + CalcFunctions.Multiply(mult1,mult2));
                break;
            
            case 4:
                System.out.println("Select the first number():");
                int div1 = input.nextInt();
                System.out.println("Select the second number:");
                int div2 = input.nextInt();

                System.out.println("Result :" + CalcFunctions.Divide(div1,div2));
                break;

            case 5:
                System.out.println("Select [1] to convert from C° to F°:\n");
                System.out.println("Select [2] to convert from F° to C°:\n");
                int conversionOption = input.nextInt();
                
                System.out.println("Result :" + CalcFunctions.Convert(conversionOption));

                break;
            


        }


        input.close();
    }

}