
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
    static double Round(double n1){
        return (double) (Math.round(n1 * 100.0) / 100.0);
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
        System.out.println("Selected : " + functionSelection);

        switch (functionSelection) {
            case 1:
                System.out.println("Select the first number:");
                double add1 = input.nextDouble();
                System.out.println("Select the second number:");
                double add2 = input.nextDouble();

                result = Round(add1 + add2);

                System.out.println("Result :" + result);
                break;

            case 2:
                System.out.println("Select the first number:");
                double sub1 = input.nextDouble();
                System.out.println("Select the second number:");
                double sub2 = input.nextDouble();

                result = Round(sub1 - sub2);

                System.out.println("Result :" + result);
                break;
            
            case 3:
                System.out.println("Select the first number:");
                double mult1 = input.nextDouble();
                System.out.println("Select the second number:");
                double mult2 = input.nextDouble();

                result = Round(mult1 * mult2);

                System.out.println("Result :" + result);
                break;
            
            case 4:
                System.out.println("Select the first number:");
                double div1 = input.nextDouble();
                System.out.println("Select the second number:");
                double div2 = input.nextDouble();

                if(div2 != 0 ){

                result = Round(div1 / div2); 

                System.out.println("Result :" + result);
                }else{
                    System.out.println("Error! Cannot divide by 0.");
                }
                break;

            case 5:
                System.out.println("Select [1] to convert from C° to F°:\n");
                System.out.println("Select [2] to convert from F° to C°:\n");
                int conversionOption = input.nextInt();
                
                System.out.println("Type in the value to be converted:");
                double conversionValue = input.nextDouble();


                    switch(conversionOption){
                        case 1:
                            double tempF =( conversionValue * 1.8 )+ 32;
                            result =  Round(tempF);
                            break;

                        case 2:
                            double tempC = (conversionValue - 32) / 1.8;
                            result= Round(tempC);
                            break;

                        default:
                            System.out.println("Error! Select options 1 or 2.");
                    }

                System.out.println("Result :" + result);

                break;
            
            
            case 6:
                System.out.println("Closing calculator...");
                break;
            
            default: 
            System.out.println("Error! Select one of the options above.");
            break;
        }


        input.close();
    }

}