public class CalcFunctions(){

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
        int conversionOption = input.nextdouble();

        System.out.println("Type in the value to be converted:");
        double conversionValue = input.nextdouble();


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

