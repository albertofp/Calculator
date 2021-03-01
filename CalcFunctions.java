public class CalcFunctions(){

    public static int Round(int n1){
        return (int) (Math.round(n1 * 100.0) / 100.0);
    }

    public static int Add(int n1, int n2) {
        return (n1 + n2);
    }

    public static int Subtract(int n1, int n2){
        return (n1 - n2);
    }

    public static int Multiply(int n1, int n2){
        return (n1 * n2);
    }

    public static int Divide(int n1, int n2){
        return (n1 / n2);
    }

    public static int Convert(){
        System.out.println("Select [1] to convert from C° to F°:\n");
        System.out.println("Select [2] to convert from F° to C°:\n");
        int conversionOption = input.nextInt();

        System.out.println("Type in the value to be converted:");
        int conversionValue = input.nextInt();


        switch(conversionOption){
            case 1:
                int tempF = conversionValue * (9/5) + 32;
                return tempF;
                break;

            case 2:
                int tempC = (conversionValue - 32) / 18;
                return tempC;
                break;

            default:
                System.out.println("Error! Select options 1 or 2.");
        }
    }