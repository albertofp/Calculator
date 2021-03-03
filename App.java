
        /*
            1. select an operator
            2. ask for & validate input
            3. calculate result
            4. show result
            5. wipe or save result
        */

import java.util.Scanner;

public class App {

    //Holds the final value
    static double result = 0;


    //Rounds the final value before it is displayed
    static int Round(int n1){
        return (int) (Math.round(n1 * 100.0) / 100.0);
    }

    public static void main(String[] args) {
        int functionSelection; //Controls which calculator function is to be executed

        System.out.println("Simple Calculator \n by albertofp");
        System.out.println("\n\n");
        System.out.println("Select the function you want to use\n");
        Scanner input = new Scanner(System.in); //Scanner() is used to take user input

        System.out.println("[1] Addition \n");
        System.out.println("[2] Subtraction \n");
        System.out.println("[3] Multiplication \n");
        System.out.println("[4] Division \n");
        System.out.println("[5] Celsius/Fahrenheit converter \n");
        System.out.println("[6] Exit calculator \n");
        functionSelection = input.nextInt();
        System.out.println("Input : " + functionSelection);

        switch (functionSelection) {
            case 1:
                System.out.println("Select the first number:");
                int add1 = input.nextInt();
                System.out.println("Select the second number:");
                int add2 = input.nextInt();

                result = add1 + add2;

                System.out.println("Result :" + result);
                break;

            case 2:
                System.out.println("Select the first number:");
                int sub1 = input.nextInt();
                System.out.println("Select the second number:");
                int sub2 = input.nextInt();

                result = sub1 + sub2;

                System.out.println("Result :" + result);
                break;
            
            case 3:
                System.out.println("Select the first number:");
                int mult1 = input.nextInt();
                System.out.println("Select the second number:");
                int mult2 = input.nextInt();

                result = mult1 * mult2;

                System.out.println("Result :" + result);
                break;
            
            case 4:
                System.out.println("Select the first number():");
                int div1 = input.nextInt();
                System.out.println("Select the second number:");
                int div2 = input.nextInt();

                result = Round(div1 / div2); 

                System.out.println("Result :" + result);
                break;

            case 5:
                System.out.println("Select [1] to convert from C° to F°:\n");
                System.out.println("Select [2] to convert from F° to C°:\n");
                int conversionOption = input.nextInt();
                
                System.out.println("Type in the value to be converted:");
                int conversionValue = input.nextInt();


                    switch(conversionOption){
                        case 1:
                            int tempF = conversionValue * (9/5) + 32;
                            result =  Round(tempF);
                            break;

                        case 2:
                            int tempC = (conversionValue - 32) / 18;
                            result= Round(tempC);
                            break;

                        default:
                            System.out.println("Error! Select options 1 or 2.");
                    }

                System.out.println("Result :" + result);

                break;
            

            default: 
            System.out.println("Error! Select one of the options above.");
            break;
        }


        input.close();
    }

}