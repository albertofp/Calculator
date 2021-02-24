
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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select the number of the function you want to use\n");
        System.out.println("[1] Addition \n");
        System.out.println("[2] Subtraction \n");
        System.out.println("[3] Multiplication \n");
        System.out.println("[4] Division \n");
        System.out.println("[5] Celsius/Fahrenheit converter \n");
        System.out.println("[Q] Exit calculator \n");

        int functionSelection = scanner.nextInt();
        System.out.println(functionSelection);
    }

}

public class Functions{

    public static double Round(double n1){
        return Math.round(n1 * 100.0) / 100.0;
    }

    public static double Add(double n1, double n2) {
        return (n1 + n2);
    }

    public static double Subtract(double n1, double n2){
        return (n1 - n2);
    }

    public static double Multiply(double n1, double n2){
        return (n1 * n2);
    }

    public static double Divide(double n1, double n2){
        return (n1 / n2);
    }

    public static double Convert(){
        System.out.println("Select [1] to convert from C° to F°:\n");
        System.out.println("Select [2] to convert from F° to C°:\n");
        int conversionOption = scanner.nextInt();

        System.out.println("Type in the value to be converted:");
        double conversionValue = scanner.nextdouble();


        switch(conversionOption){
            case 1:
                double tempF = conversionValue * (9/5) + 32;
                return tempF;
                break;

            case 2:
                double tempC = (conversionValue - 32) / 18;
                return tempC;
                break;

            default:
                System.out.println("Error! Select options 1 or 2.");
        }
    }
}
